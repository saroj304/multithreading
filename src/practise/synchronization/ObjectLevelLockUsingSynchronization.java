package practise.synchronization;


class DisplayData {
    public synchronized void displayNumber() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

    public synchronized void displayCharacter() {
        for (int i = 65; i < 70; i++) {
            System.out.println((char) (i));
        }
    }
}


class SynchronizedTest3 extends Thread {
    Display d;

    public SynchronizedTest3(Display d) {
        this.d = d;
    }

    public void run() {
        d.displayNumber();
    }

}

class SynchronizedTest4 extends Thread {
    Display d;

    public SynchronizedTest4(Display d) {
        this.d = d;
    }

    public void run() {
        d.displayCharacter();
    }

}

public class ObjectLevelLockUsingSynchronization {
    public static void main(String[] args) {
        Display d = new Display();
        SynchronizedTest3 t1 = new SynchronizedTest3(d);
        SynchronizedTest4 t2 = new SynchronizedTest4(d);
        t1.start();
        t2.start();
    }
}
