package arrays;

public class InsertArray {
    public static void main(String args[]){
        int A[]=new int[10];
        A[0]=2;
        A[1]=3;
        A[2]=7;
        A[3]=9;
        A[4]=11;
        int n=5;
        int index=2;
        for (int i=n;i>index;i--){
            A[i]=A[i-1];
        }
        A[index]=5;
        for(int x:A){
            System.out.print(x+", ");
        }
        // for(int i=n;i>4;i--){
        //    A[]
        // }
        System.out.println("");
        for(int x:A){
            System.out.print(x+", ");
        }
    }
}