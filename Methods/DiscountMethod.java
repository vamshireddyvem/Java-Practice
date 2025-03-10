package Methods;

public class DiscountMethod {
    static  double Discount(int total){
            double Discount=0;
            if(total>100 && total<200){
                Discount=20;
            }
            else if(total>200 && total<300){
                Discount=30;  
            }
            
            else if(total>300 && total<400){
                Discount=40;
                
            }
            else if(total>=500){
                Discount=50;  
    
            }
            double discountAmount = (total * Discount) / 100; 
            double finalTotal = total - discountAmount;
    
            System.out.println("Total Before Discount: $" + total);
            System.out.println("Discount Applied: " + Discount + "% (-$" + discountAmount + ")");
        
        return finalTotal; 
    }
    public static void main(String[] args) {
        int[] prices = {100, 50, 200, 150};
        int total=Sum_Of_Array_VaraiableArgs.SumArray(prices);
         System.out.println("Final Amount : "+Discount(total));
    }
}
