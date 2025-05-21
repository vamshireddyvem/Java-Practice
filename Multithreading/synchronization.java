package Multithreading;
class mydata{
    synchronized void display(String str){
        for(int i=0;i<str.length();i++){
            System.out.println(str.charAt(i));
        }
    }
}
class mythread1 extends Thread{
    mydata d;
    mythread1(mydata d){
        this.d=d;
    }
    public void run(){
        d.display("Hello ");
    }
}
class mythread2 extends Thread{
    mydata d;
    mythread2(mydata d){
        this.d=d;
    }
    public void run(){
        d.display("world");
    }
}
public class synchronization {
    public static void main(String[] args) {
        mydata data= new mydata();
        mythread1 t1= new mythread1(data);
        mythread2 t2= new mythread2(data);
        t1.start();
        t2.start();
    }
}
