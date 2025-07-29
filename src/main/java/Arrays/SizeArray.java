package Arrays;

public class SizeArray {
    public static void main(String[] args) {
        int s[]={2,6,4,7,8,9};
        System.out.println(s.length);
        int t[]=new int[10];
        System.out.println(t.length);
        for(int i=0; i<s.length;i++){
            t[i]=s[i];
        }
        for(int x:t){
            System.out.print(x+", ");
        }
        System.out.println("");
   
        System.out.println(s.length);
   
        s=t;
        t=null;
        System.out.println(s.length);
        for(int x:s){
            System.out.print(x+", ");
        }
    }
}
