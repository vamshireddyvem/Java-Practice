package Methods;

public class MethodsIntro {
    static int sum(int x, int y){
         return x+y; 
    }
    static void update (int x[],int index,int value){
            x[index]=value;
    }
    public static void main(String args[]){
    int a=10;int b=15;
    int c= sum(a,b);
    System.out.println(c);
    int q[]={1,3,4,5,6,7,8,0};
    update(q,7,9);   
        for (int x:q){
                System.out.print(x);
            }
        }

}