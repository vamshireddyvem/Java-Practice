package Methods;

public class ReversingIntORArray {
    static int Reverse(int x ){
        int rev=0;
        while(x>0){
            int r;
            r=x%10;
            x=x/10;
            rev=(rev*10)+r;
        }
        return rev;
    } 
    static int[]  Reverse(int x[]){
        int arr2[]=new int[x.length];
        for (int i =x.length-1, j=0; i>=0;i--,j++){
            arr2[j]=x[i];
        }
        return arr2;
     }
    public static void main(String[] args) {
        int a=123;
        System.out.println(Reverse(a));
        int arr[]={9,8,7,6,5,4,3,2,1};
        for(int x:Reverse(arr)){
            System.out.print(x+", ");
        }
    }
}
