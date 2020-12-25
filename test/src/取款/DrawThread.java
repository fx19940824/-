package 取款;

public class DrawThread extends Thread {

    private Account account;

    private double drawMoney;

    public DrawThread(Account account, int drawMoney) {
        this.account = account;
        this.drawMoney = drawMoney;
    }

    @Override
    public void run (){
        account.draw(this.drawMoney);
        System.out.println("线程名字：" + this.getName());
    }
}
