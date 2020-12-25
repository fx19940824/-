package 线程池;

public class ThreadTest implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName() + "-----i:" + i);
        }
    }
}
