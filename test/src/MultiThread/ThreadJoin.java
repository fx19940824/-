package MultiThread;

public class ThreadJoin extends Thread {

    public static void main(String[] args) {
        ThreadJoin thread = new ThreadJoin();
        thread.setName("线程一");
        thread.start();
        try {
            thread.join();
            for (int j = 0; j < 50; j++) {
                //if (j == 20) {
                //    thread.join();
                //}
                System.out.println("线程名字为：" + Thread.currentThread().getName() + "=====j=====" + j);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("线程名字为：" + Thread.currentThread().getName() + "=====i=====" + i);
        }
    }
}
