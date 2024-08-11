package practise.synchronization;

class Display {
    public void displayNumber() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

    public void displayCharacter(){
        for (int i = 65; i < 70; i++) {
            System.out.println((char)(i));
        }
    }
}


class SynchronizedTest1 extends Thread{
    Display d;
    public SynchronizedTest1(Display d) {
        this.d = d;
    }
    public void run() {
        d.displayNumber();
    }

}

class SynchronizedTest2 extends Thread{
    Display d;
    public SynchronizedTest2(Display d) {
        this.d = d;
    }
    public void run() {
        d.displayCharacter();
    }

}
public class ObjectLevelLockWithoutSynchronization {
    public static void main(String[] args) {
        Display d = new Display();
        SynchronizedTest1 t1 = new SynchronizedTest1(d);
        SynchronizedTest2 t2 = new SynchronizedTest2(d);
        t1.start();
        t2.start();
    }
}
