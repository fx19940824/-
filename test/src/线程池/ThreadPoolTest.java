package 线程池;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolTest {
    public static void main(String[] args) {

        // 创建容量为3的线程池
        ExecutorService executorService = Executors.newFixedThreadPool(1);

        // Runnable实现类
        ThreadTest threadTest = new ThreadTest();

        // 将Runnable实现类ThreadTest实例提交给线程池
        executorService.submit(threadTest);
        executorService.submit(threadTest);
        executorService.submit(threadTest);
        executorService.submit(threadTest);
    }
}
