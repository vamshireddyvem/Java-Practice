package Concepts;

public class Recursion {
    static void fun(int n){
        if(n>0){
            System.out.println(n);
            fun(n-1);//Recurison can be done using calling a method in it own method where the method have to stretch and retutn back which is bothways towards and backwards
        }
    }
    static void fun1(int n){
        if (n>0){
            fun1(n-1);
            System.out.println(n);
        }
    }
    public static void main(String[] args) {
        fun(5);
        fun1(5);
    }
}
