package Multithreading;
class data{
    int value;
    boolean flag;
    synchronized public void set(int value){
        while(flag!=true){
            try {
                 wait();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        this.value=value;
        flag=false;
        notify();
    }
    synchronized public int get(){
        int x;
        while(flag!=false){
            try {
                 wait();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        x=value;
        flag=true;
        notify();
        return x;
    }
}
class producer extends Thread{
    data my;
    producer(data my){
        this.my=my;
    }
    public void run(){
        int count=1;
        while(true){
            this.my.set(count);
            System.out.println("Producer -"+count);
            count++;
        }
    }
}
class consumer extends Thread{
    data my;
    public consumer(data my){
        this.my=my;
    }
    public void run(){
        int value;
        while(true){
            value=this.my.get();
            System.out.println("Consumer -"+value);
        }
    }
}
public class inter_thread_communication {
    public static void main(String[] args) {
        data d =new data();
        producer p= new producer(d);
        consumer c= new consumer(d);
        p.start();
        c.start();
    }
}
