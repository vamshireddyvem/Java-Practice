package LAMBDAEXP;
@FunctionalInterface
interface Grand {
    void display(String Str);
}
class A{
    static void reverse1(String S){
        StringBuffer SB= new StringBuffer(S);
        SB.reverse(); 
        System.out.println(SB);
    }
}
class Method_Reference {
    public static void main(String[] args) {
        
        Grand G=A::reverse1;
        G.display("hello");
    }
}
