package MultiThread;

/**
 * 创建线程
 * 通过继承Thread
 */

public class MyThread_01 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("线程名字为：" + this.getName() + "=====i=====" + i);
        }
    }

    public static void main(String[] args) {
        MyThread_01 myThread_01 = new MyThread_01();
        myThread_01.setName("线程一");
        myThread_01.start();
        for (int i = 0; i < 50; i++) {
            System.out.println("线程名字:" + Thread.currentThread().getName() + "===========i=========" + i);
        }
    }
}
