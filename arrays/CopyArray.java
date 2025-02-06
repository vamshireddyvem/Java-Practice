package arrays;

public class CopyArray {
    @SuppressWarnings("ManualArrayToCollectionCopy")
    public static void main(String args[]){
        int kushu[]={12,10,9,6,5,3};
        int stri[]=new int [6];
        for (int i = 0; i < kushu.length; i++) {
            stri[i]=kushu[i];
        }
        for(int x:stri){
            System.out.print(x+", ");
        }
    }
}
