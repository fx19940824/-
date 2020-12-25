package 线程通信;

public class Account {
    private String cardId;

    private String password;

    private double amount;

    private boolean flag = true;

    public synchronized void drawMoney(double money) {
        try{
            if (flag) {
                if (this.getAmount() >= money) {
                    this.setAmount(this.amount - money);
                    System.out.println(Thread.currentThread().getName() + "取款成功，余额" + this.amount);
                } else {
                    flag = false;
                    this.notifyAll();
                    this.wait();
                    System.out.println(Thread.currentThread().getName() + "取款失败，余额不够");
                }
            } else {
                this.notifyAll();
                this.wait();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public synchronized void saveMoney(double money) {
        try {
            Thread.sleep(1000);
            if (!flag) {
                this.setAmount(this.amount + money);
                System.out.println(Thread.currentThread().getName() + "存款成功，余额" + this.amount);
                flag = true;
            }
            this.notifyAll();
            this.wait();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
