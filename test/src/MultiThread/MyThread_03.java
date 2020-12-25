package MultiThread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class MyThread_03 implements Callable<Integer> {
    public static void main(String[] args) {
        // 创建MyThread3实例
        MyThread_03 callable = new MyThread_03();

        // 创建FutureTask实例，FutureTask就是Runnable实现类
        FutureTask<Integer> futureTask = new FutureTask<>(callable);

        // 创建Thread实例
        Thread thread = new Thread(futureTask);
        thread.setName("线程一");
        thread.start();
        try {
            int count = futureTask.get();
            System.out.println("count=" + count);
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (int j = 0; j < 50; j++) {
            System.out.println("线程名字为：" + Thread.currentThread().getName() + "====j====" + j);
        }


    }

    @Override
    public Integer call() throws Exception {
        int count = 0;
        for (int i = 0; i < 50; i++) {
            System.out.println("线程名字为：" + Thread.currentThread().getName() + "=====i=====" + i);
            count++;
        }
        return count;
    }
}
