package Arrays;

public class ShiftingArrayE {
    public static void main(String args[]){
        int temp;
        int A[] ={99,59,7,3,4,2,10,17,6,41,28,96,34,14,19,72};
        temp=A[0];
        for(int i=1;i<A.length;i++){
            A[i-1]=A[i];
        }
        A[A.length-1]=temp;
        for (int x:A){
        System.out.print(x);
        System.out.print(", ");
        }
    }
}
