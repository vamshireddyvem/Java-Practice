package Multithreading;
class whiteboard{
    String text;
    int noofstudents=0;
    int count=0;
    void attendance(){
            noofstudents++;
        }
    synchronized public void write(String text){
        System.out.println("Teacher is Writing " +text);
        while(count!=0){
        try {
            wait();
        } catch (Exception e) {
           System.out.println(e);
        }
    }
        this.text=text;
        count=noofstudents;
        notifyAll();
    }
    synchronized public String  read(){
        String msg;
        while (count==0) {
            try {
                wait();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        msg=text;
        count--;
        if(count==0){
            notify();
        }
        return msg;
    }
}
class teacher extends Thread{
    whiteboard board;
    String notes[]={"Java is language","It is OOPs","It is Platform Independent","It supports Thread","end"};
    teacher( whiteboard board){
        this.board=board;
    }
    public void run(){
        for(int i=0; i<notes.length;i++){
            board.write(notes[i]);
        }
    }
}
class students extends Thread{
    String name;
    whiteboard wb;
    students(String name, whiteboard wb){
        this.name=name;
        this.wb=wb;
    }
    public void run(){
        String text;
        wb.attendance();
        do
        {
            text=wb.read();
            System.out.println(name + " Reading " + text);
            System.out.flush();
        }while(!text.equals("end"));
    
    }
}
public class student_excersie_whiteboard {
    public static void main(String[] args) {
        whiteboard class1= new whiteboard();
        teacher m1= new teacher(class1);
        students g=new students("jinsu", class1);
        students h=new students("vamshi", class1);
        students i=new students("shiva", class1);
        students j=new students("sai", class1);
        m1.start();
        g.start();
        h.start();
        i.start();
        j.start();
    }
}