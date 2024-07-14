package practise.priority;
//default priority of the main thread is always 5 and the child thread will extend the
//priority of the main thread

public class ThreadPriority extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {

        ThreadPriority t = new ThreadPriority();

        ThreadPriority t2 = new ThreadPriority();
        t2.setPriority(Thread.MAX_PRIORITY);

        System.out.println(Thread.currentThread().getPriority());
        t.start();
        t2.start();

        System.out.println(t2.getPriority());

    }
}
