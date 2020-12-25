package 线程通信;

public class SaveThread extends Thread {

    private Account account;

    private double money;

    public SaveThread(Account account, double money) {
        this.account = account;
        this.money = money;
    }

    @Override
    public void run() {
        while (true) {
            account.saveMoney(this.money);
        }
    }
}
