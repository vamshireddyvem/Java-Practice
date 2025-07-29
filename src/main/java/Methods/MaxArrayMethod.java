package Methods;

public class MaxArrayMethod {
   static  int MaxArrayElement(int x[]){
    int max,temp;
    max=temp=x[0];
        for(int i=0;i<x.length;i++){
            if(x[i]>max){
                temp=max;
                max=x[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int a[]={112,998,223,403,454,755,186,1209,397,999,498,109,505,402};
        System.out.println(MaxArrayElement(a));
    }
}
