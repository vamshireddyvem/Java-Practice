package Arrays;

public class ReversingArray {
    public static void main(String args[]){
        int arr[]={9,8,7,6,5,4,3,2,1};
        int arr2[]=new int[9];
        for (int i =arr.length-1, j=0; i>0-1;i--,j++){
            arr2[j]=arr[i];
        }
        arr=arr2;
        for(int x:arr){
            System.out.print(x+", ");
        }
    }
}
