package practise.priority;

public class SettingPriority extends Thread {

    @Override
    public void run() {
        System.out.println("childTHread" +" "+Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {

        SettingPriority settingPriority = new SettingPriority();
        settingPriority.setPriority(8);
        settingPriority.start();
        System.out.println("main thread"+" "+Thread.currentThread().getPriority());
    }
}
