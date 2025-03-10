package Methods;

public class Max_VariableArguments {
    
    static int max(int ...x){
        if (x.length==0) return Integer.MIN_VALUE;
        int max1=  x[0];
        for(int i=0; i<x.length;i++){
                if(x[i]>max1){
                    max1=x[i];
                }
            }
            return max1;
        }
       public static void main(String[] args) {
        System.out.print(max(1,2,3,4,5,6,7,8,9,5));
       }
}
    

