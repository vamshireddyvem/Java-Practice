package Methods;

public class Sum_Of_Array_VaraiableArgs {
    static int SumArray(int a[]){
        int sum=0;
        for (int i=0;i<a.length;i++) {
            sum=sum+a[i];
        }
        return sum;
    }
    public static void main (String args[]){
        int g[]={1,2,3,4,5,6,7,8,9};
        System.out.println(SumArray(g));
    }
}