package practise.thread_execution_prevention_methods;

public class joinTest {
    public static void main(String[] args) {
        childThread thread = new childThread();
        thread.start();

        try {
            //parent thread waits until child thread completes or exception occured
//            thread.join();
            //parent thread waits for 20s and gets cpu time
            thread.join(20000);


        } catch (InterruptedException e) {

            throw new RuntimeException(e.getMessage());
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("iam a parent thread" + i);
        }
    }


    static class childThread extends Thread {

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println("child thread " + i);
                try {
                    //child thread sleeps for 10 sec and again executes
                    sleep(10000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
