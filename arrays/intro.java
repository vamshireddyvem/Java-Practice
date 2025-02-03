package arrays;

public class intro {
    public static void main(String args[]){
        int a[]={1,2,3,4,5,6,7,8,9};
        int b[]=new int[5];
        b[2]=5;
        int c[];
        c=new int[4];
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]++);
        }
        System.out.println("");
        for (int i:a){
            System.out.print(i);
        }
        System.out.println("");
        for (int i:a){
            System.out.print(++i);
        }

        System.out.println("");
        for (int i:b){
            System.out.print(i);
        }

    }
}
