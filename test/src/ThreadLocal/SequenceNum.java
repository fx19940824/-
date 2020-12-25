package ThreadLocal;

public class SequenceNum {

    ThreadLocal<Integer> threadLocal = new ThreadLocal<>();

    static Integer i = 0;

    public Integer getNextNum() {
        i = threadLocal.get();
        if (i == null) {
            i = 0;
        }

        // 自增
        i++;
        threadLocal.set(i);
        return i;
    }

    public static void main(String[] args) {
        SequenceNum sequenceNum01 = new SequenceNum();
        ThreadTest threadTest01 = new ThreadTest(sequenceNum01);
        threadTest01.setName("线程一");
        ThreadTest threadTest02 = new ThreadTest(sequenceNum01);
        threadTest02.setName("线程二");
        ThreadTest threadTest03 = new ThreadTest(sequenceNum01);
        threadTest03.setName("线程三");

        threadTest01.start();
        threadTest02.start();
        threadTest03.start();
    }
}
