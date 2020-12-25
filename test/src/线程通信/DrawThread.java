package 线程通信;

public class DrawThread extends Thread {

    private Account account;

    private double money;

    public DrawThread(Account account, double money) {
        this.account = account;
        this.money = money;
    }

    @Override
    public void run() {
        while (true) {
            account.drawMoney(this.money);
        }
    }
}
