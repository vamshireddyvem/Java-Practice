package Arrays;

public class MaxArray {
   public static void main(String args[]){
    int a[]={112,998,223,403,454,755,186,397,999,498,109,505,402};
    int max1;
    int max2;
    max1=max2=a[0];
    for(int i=0;i<a.length;i++){
        if(a[i]>max1){
            max2=max1;
            max1=a[i];
        }
        else if(a[i]>max2){
            max2=a[i];
        }
    }
    System.out.println(max1);
    System.out.println(max2);
   } 
}
