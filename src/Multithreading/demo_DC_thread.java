package Multithreading;
class demo_DC_thread1 extends Thread {
    public void run() {
        int i=1;
        while(i<=15) {
            System.out.println(i+" thread 1");
            i++;
        }
    }
}
public class demo_DC_thread {
    public static void main(String[] args) {
        demo_DC_thread1 t1 = new demo_DC_thread1();
        t1.start();
        int i=1;
        while(i<=15) {
            System.out.println(i+" thread 2");
            i++;
        }
    }
}
