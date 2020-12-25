package ThreadLocal;

public class ThreadTest extends Thread {

    SequenceNum sequenceNum;
    public ThreadTest(SequenceNum sequenceNum) {
        super();
        this.sequenceNum = sequenceNum;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("当前线程名：" + this.getName() + "   ----i：" + sequenceNum.getNextNum());
        }
    }
}
