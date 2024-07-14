package practise;

public class ParentThread {

    public static void main(String args[]) {
        ChildThread childThread = new ChildThread();
        childThread.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("iam a parent thread");
        }
    }


}
