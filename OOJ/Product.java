package OOJ;

import java.rmi.Naming;

public class Product {
    
    private String Name;
    private int ItemNo; 
    private int Price;
    private int Qty;
    public Product(int i, int j, int k,String N){
       Name=N;
       ItemNo=k;
       setPrice(i);
       setQty(j);
       
     }
    public String getName(){
        return Name;
    }
    public int getItemNo(){
        return ItemNo;
     }
    public int getQty(){
        return Qty;
    }
    public int getPrice(){
        return Price;
     }

     public void setQty(int k){
        Qty=k;
     }
     public void setPrice(int i){
        Price=i;
     }
     int Total(){return Price*Qty;}
     
     void display(){
        System.out.println(ItemNo+" Name:"+Name+" "+Qty+" "+ Price+" "+Total());
     }
   
}
class Consumer {
    private String CustomerName;
    private String CustomerId;
    private String PhNo;
    public Consumer(String CN,String CI,String ph){
        CustomerName=CN;
        CustomerId=CI;
        setPhNo(ph);
     }
    
    public String  getCustomerName(){
        return CustomerName="";
     }
     
     public String getCustomerId(){
        return CustomerId="";
     }
     public String getPhNo(){
        return PhNo="";
     }
     public void setPhNo(String ph){
        PhNo=ph;
     }
     public void setCustomerName(String CN ){
        CustomerName=CN;
     }
     void display(){
        System.out.println(CustomerId+" "+CustomerName+" "+PhNo);
     }
     
    }

    class Shop{
        public static void main(String args[]){
            Product p =new Product(3,2,123,"OIL");
          p.display();
          Consumer q=new Consumer("Nani", "1DQ12A", "12334556");
          q.display();
        }
    }