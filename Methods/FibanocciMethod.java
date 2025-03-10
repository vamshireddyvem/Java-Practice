package Methods;

public class FibanocciMethod {
    static void fib(int x, int y , int z){
        System.out.println("Fibonacci of "+ x+" and "+y+ " for "+z+" times is");
        System.out.print(x+" "+y);
        for(int i=2;i<=z;i++){
            int c=x+y;
            System.out.print(" "+c);
            x=y;
            y=c;
        }
    }
    public static void main(String[] args) {
    fib(0, 1, 5);
    }
}
