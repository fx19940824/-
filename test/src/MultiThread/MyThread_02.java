package MultiThread;

/**
 * 创建线程
 * 通过实现接口Runnable
 */

public class MyThread_02 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("线程名字为：" + Thread.currentThread().getName() + "=====i=====" + i);
        }
    }

    public static void main(String[] args) {
        MyThread_02 myThread_02 = new MyThread_02();
        Thread thread = new Thread(myThread_02);
        thread.setName("打开聊天窗口");
        thread.start();

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int k = 0; k < 50; k++) {
                    System.out.println("线程名字为：" + Thread.currentThread().getName() + "====k=====" + k);
                }
            }
        };

        Thread thread2 = new Thread(runnable);
        thread2.setName("游戏");
        thread2.start();



        for (int i = 0; i < 50; i++) {
            System.out.println("线程名字:" + Thread.currentThread().getName() + "===========i=========" + i);
        }
    }
}
