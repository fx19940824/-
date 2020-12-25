package MultiThread;

public class ThreadTest extends Thread {
    public static void main(String[] args) {
        ThreadTest thread = new ThreadTest();
        thread.setName("线程一");
        thread.setPriority(Thread.MAX_PRIORITY);
        thread.start();
        for (int i = 0; i < 100; i++) {
            Thread thread2 = Thread.currentThread();
            System.out.println(i + "name:" + thread2.getName() + "       id:" + thread2.getId() + "    priority:" + thread2.getPriority());

        }

    }

    @Override
    public void run() {
        for (int j = 0; j < 100; j++) {
            System.out.println(j + "name:" + this.getName() + "       id:" + this.getId() + "    priority:" + this.getPriority());

        }
    }
}
