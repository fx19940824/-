package 线程通信;

public class ThreadTest {
    public static void main(String[] args) {
        Account account = new Account();
        account.setCardId("8888");
        account.setPassword("1234");
        account.setAmount(10000);

        DrawThread drawThread = new DrawThread(account, 1000);
        drawThread.setName("小明");
        drawThread.start();

        SaveThread saveThread01 = new SaveThread(account, 2000);
        saveThread01.setName("小头爸爸");
        SaveThread saveThread02 = new SaveThread(account, 3000);
        saveThread02.setName("二叔");
        SaveThread saveThread03 = new SaveThread(account, 5000);
        saveThread03.setName("隔壁老王");

        saveThread01.start();
        saveThread02.start();
        saveThread03.start();
    }
}
