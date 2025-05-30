package LAMBDAEXP;
@FunctionalInterface
interface My {
int add(int a, int b);
}
public class Lambdaparam {
    public static void main(String[] args) {
        My z=(a,b)->(a+b);  // lambda expressions can automatically detects the retutn type and it also detects the return data and returns the value even without mentioning return in the expression.*/
        System.out.println(z.add(2, 5));
    }
}
