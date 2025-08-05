package Methods;

public class Prime {
    static boolean  prime(int x){
        for (int i = 2; i <=x/2; i++) {
                if(x%i==0) {
                return false;   
                }
    }
    return true;   
}
    public static void main(String[] args) {
        for (int i = 2; i < 100; i++){
           if ( prime(i)){
            System.out.println(i+" is prime");
            }
        }
    }
}