package Multithreading;
class first implements Runnable{
    public void run(){
        for(int i=0;i<=50;i++){
            System.out.println("Hello");
        }
    }
}

public class demo_DC_thread_with_runnable_constructors {
    public static void main(String[] args) {
        Thread st= new Thread(new first(), "test1");
        st.start();
        for(int i=0;i<=50;i++){
            System.out.println("world");
        }
    }
}
