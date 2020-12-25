package 线程组;

import java.util.concurrent.locks.Lock;

public class ThreadGroupTest {
    public static void main(String[] args) {
        ThreadGroup threadGroup = new ThreadGroup("线程组一") {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                e.printStackTrace();
                System.out.println(t.getName() + "异常原因：" + e.getMessage());
            }
        };
        Lock lock;
    }
}
