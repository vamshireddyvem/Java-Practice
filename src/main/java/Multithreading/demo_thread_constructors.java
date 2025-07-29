package Multithreading;

public class demo_thread_constructors extends Thread{
    public demo_thread_constructors(String name) {
        super(name);
    }
    public void run(){
        if(true){
            System.out.println("jhgdgh");
        }
     }
    public static void main (String args[]){
        demo_thread_constructors t1= new demo_thread_constructors(" djhf");

    }
}
