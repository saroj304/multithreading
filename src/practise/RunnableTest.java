package practise;

public class RunnableTest {
    public static void main(String[] args) {
        MYRunnable myRunnable = new MYRunnable();
        Thread t1 = new Thread(myRunnable);
        t1.start();
        t1.run();//mainthread is responsible to run this as new thread is not created
        Thread t2 = new Thread();
        t2.start();
        t2.run();
    }

    static class MYRunnable implements Runnable {


        @Override
        public void run() {
            for (int i = 0; i < 1; i++) {
                System.out.println(Thread.currentThread().getName());
            }
        }
    }
}
