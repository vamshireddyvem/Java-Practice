package Arrays;

public class SumArrayE {
    public static void main(String args[]){
        int sum=0;
        int a[]={1,2,3,4,5,6,7,8,9};
        int b[]={1,2,3,4,5};
        for (int i=0;i<a.length;i++) {
            sum=sum+a[i];
        }
        System.out.println(sum);
        for(int i:b){
            sum=sum+i;
        }
        System.out.println(sum);
    }
}
