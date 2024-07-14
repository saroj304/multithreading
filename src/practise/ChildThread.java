package practise;

public class ChildThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("iam a child thread");
        }
    }
}
