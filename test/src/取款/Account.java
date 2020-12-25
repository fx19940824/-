package 取款;

public class Account {
    private String cardId;

    private String password;

    private double amount;

    public synchronized void draw(double drawMoney) {
        if (this.getCardId().equals("8888") && this.getPassword().equals("1234")) {
            synchronized (this) {

            }
            if (this.getAmount() >= drawMoney) {
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                this.setAmount(this.getAmount() - drawMoney);
                System.out.println(Thread.currentThread().getName() + "取款成功，卡中余额" + this.getAmount());
            } else {
                System.out.println(Thread.currentThread().getName() + "取款失败，余额不足");
            }
        } else {
            System.out.println(Thread.currentThread().getName() + "取款失败，账号密码错误");
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
