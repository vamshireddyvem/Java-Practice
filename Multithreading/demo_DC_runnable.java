package Multithreading;
class demo_DC_runnable1 implements Runnable {
    public void run() {
        int i=1;
        while(i<=15) {
            System.out.println(i+" thread 1");
            i++;
        }
    }
}
public class demo_DC_runnable {
    public static void main(String[] args) {
        demo_DC_runnable1 t1 = new demo_DC_runnable1();
        Thread thread = new Thread(t1);
        thread.start();
        int i=1;
        while(i<=15) {
            System.out.println(i+" thread 2");
            i++;
        }
    }
}
