package Multithreading;
class ATM{
   synchronized void checkBalance(String name ){
        System.out.println("Welcome..."+name);
        try{Thread.sleep(1000);}catch(Exception e){}
    }
     synchronized void withdrawBalance(String name, int amount ){
        System.out.println(name+" "+amount);
        try{Thread.sleep(1000);}catch(Exception e){}
    }
}
class customer1 extends Thread{
    ATM atm;
    String name;
    int amount;
    customer1( String name,ATM atm, int amount ) {
        this.name=name;
        this.amount=amount;
        this.atm=atm;
    }
    public void run(){
        atm.checkBalance(name);
        atm.withdrawBalance(name, amount);
    }
}
class customer2 extends Thread{
    ATM atm;
    String name;
    int amount;
     customer2( String name,ATM atm, int amount ) {
        this.name=name;
        this.amount=amount;
        this.atm=atm;
    }
    public void run(){
        atm.checkBalance(name);
        atm.withdrawBalance(name, amount);
    }
}
public class student_excersie {
    public static void main(String[] args) {
        ATM m=new ATM();
        customer1 v =new customer1("vamshi",m,100);
        customer2 j = new customer2("Jinsu",m,200);
        v.start();
        j.start();
    }
}
