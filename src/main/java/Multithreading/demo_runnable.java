package Multithreading;

public class demo_runnable implements Runnable {
    public void run() {
        int i=1;
        while(i<=25) {
            System.out.println(i+" thread 1");
            i++;
        }
    }
    public static void main(String[] args) {
        demo_runnable t1 = new demo_runnable();
        Thread thread = new Thread(t1);
        thread.start();
        int i=1;
        while(i<=25) {
            System.out.println(i+" thread 2");
            i++;
        }
    }
}
