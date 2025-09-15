package Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

class Customer implements Serializable{
    String Name;
    String CustomerID;
    String PhNo;
    static int count=0;

    public String  toString(){
        return "Customer Details\n"+Name+"\n"+CustomerID+"\n"+PhNo+"\n";
    }

    Customer(){

    }
    Customer(String Name, String PhNo){
        this.Name=Name;
        this.PhNo=PhNo;
        CustomerID="C"+count;
        count++;
    }
}

public class Challenge_IOStream2 {
    public static void main(String[] args)  {
        try{
        FileOutputStream fos= new FileOutputStream("E:\\JAVA Course\\Filesource\\Challenge2.txt");
        ObjectOutputStream oos= new ObjectOutputStream(fos);
        Customer Customers[]={new Customer("JINSU","1234598"),new Customer("Mani","15698975"),new Customer("Shiva","654789"), new Customer("Sai","5674697") };
        oos.writeInt(Customers.length);
        for (Customer customer : Customers) {
            oos.writeObject(customer);
        }
        fos.close();
        oos.close();
        }
        catch(IOException e){};
    
        try{
        try (Scanner scs = new Scanner(System.in)) {
            FileInputStream fis= new FileInputStream("E:\\JAVA Course\\Filesource\\Challenge2.txt");
            try (ObjectInputStream ois = new ObjectInputStream(fis)) {
                int length= ois.readInt();
                Customer customers[]=new Customer[length];
                    for(int i=0; i<length;i++){
                        customers[i]=(Customer)ois.readObject();
                    }
                    System.out.println("Enter the Name of the Customer");
                    String name= scs.nextLine();
                    for(int i=0; i<length;i++){
                        if(name.equalsIgnoreCase(customers[i].Name)){
                            System.out.println(customers[i]);
                        };
                    }
            }
        }

        }
        catch(IOException e){

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
}

}

