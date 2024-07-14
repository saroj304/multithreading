package practise.thread_execution_prevention_methods;

public class YieldTest {

    public static void main(String[] args) throws InterruptedException {

        MyThread t = new MyThread();
        t.start();
        for (int i = 1; i <= 10; i++) {
            System.out.println("Parent Thread " + i);
        }

    }


}

class MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("child Thread " + i);
            Thread.yield();
        }
    }
}