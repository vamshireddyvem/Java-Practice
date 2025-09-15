package Collections;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Scanner;

class Account implements Serializable{
    String Name;
    String AccNo;
    double Balance;

    Account(){}
    Account( String AccNo,String Name, Double Balance){
        this.AccNo=AccNo;
        this.Name=Name;
        this.Balance=Balance;
    }

    public String toString(){
        return "Account No="+AccNo+"\n"+"Name="+Name+"\n"+"Balance="+Balance+"\n";
    }
}
public class Student_Challange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account Acc= null;
       
        HashMap <String, Account>hm= new HashMap<>();
        
        try {
            FileInputStream fis= new FileInputStream("E:\\JAVA Course\\IO_Stream\\Accountdetils.txt");
            ObjectInputStream ois= new ObjectInputStream(fis);
            int count=ois.readInt();
        for(int i=0;i<count;i++)
        {
            Acc=(Account)ois.readObject();
            System.out.println(Acc);
            hm.put(Acc.AccNo,Acc);
        }
        fis.close();
        ois.close();
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            FileOutputStream fos= new FileOutputStream("E:\\JAVA Course\\IO_Stream\\Accountdetils.txt");
            ObjectOutputStream oos= new ObjectOutputStream(fos);
            int choice;
            String AccNo,Name;
            double Balance;
            System.out.println("MENU");
            do{
                System.out.println("1. Create an Account");
                System.out.println("2. Account Details");
                System.out.println("3. View All Accounts");
                System.out.println("4. Delete an Account");
                System.out.println("5. Save");
                System.out.println("6. Exit");
                System.out.println("Enter Your Choice");
                choice=sc.nextInt();
                sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
                switch (choice) {
                    case 1:
                        System.out.println("Enter AccNo");
                        AccNo=sc.nextLine();
                        System.out.println("Enter Name");
                        Name=sc.nextLine();
                        System.out.println("Enter Balance");
                        Balance=sc.nextDouble();
                        Acc=new Account(AccNo,Name,Balance);
                        hm.put(AccNo, Acc);
                        System.out.println("Account Created Successfully for"+Name);
                        break;
                
                    case 2: 
                        System.out.println("Enter Account No");
                        AccNo=sc.nextLine();
                        Acc=hm.get(AccNo); 
                        System.out.println(Acc);
                        break;
                        
                    case 3:if (hm.size()>0) {
                        for(Account a: hm.values()){
                            System.out.println(a);
                        }
                    } else {
                        System.out.println("No Entries");
                    }
                        break;
                    
                    case 4:
                        System.out.println("Enter Account No");
                        AccNo= sc.nextLine();
                        hm.remove(AccNo);
                        System.out.println("Account Deleted");
                        break;

                    case 5:
                    case 6:oos.writeInt(hm.size());
                        for(Account a:hm.values())
                        oos.writeObject(a);
                    break; 
                }
            }
            while(choice!=6);
            oos.flush();
            oos.close();
            fos.close();
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
