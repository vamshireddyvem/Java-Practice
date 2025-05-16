package Multithreading;

public class demo_thread extends Thread {
    public void run() {
        int i=1;
        while(i<=25) {
            System.out.println(i+" thread 1");
            i++;
        }
    }
    public static void main(String[] args) {
        demo_thread t1 = new demo_thread();
        t1.start();
        int i=1;
        while(i<=25) {
            System.out.println(i+" thread 2");
            i++;
        }
    }
}
