package practise.thread_execution_prevention_methods;

/*Here the parent thread is waiting for the same thread to complete the execution.Hence,it remains
* in the deadlock state waiting for itself to complete the execution*/
public class SelfJoinExample {
    public static void main(String[] args) throws InterruptedException {
        Thread.currentThread().join();
        for (int i = 0; i < 10; i++) {
            System.out.println("i=" + i);
        }
    }
}
