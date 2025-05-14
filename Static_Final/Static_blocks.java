package Static_Final;
class Test{
    static int p;
    static {
        p=9;
        System.out.println("Hi");
    }
    static {
        System.out.println("Vamshi");
    }
}

public class Static_blocks {
    int x=5;
    static int y=10;
    static {
        System.out.println("y Value is");
}
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println(Test.p);
        // Test nt =new Test();

    }
    static {
            System.out.println(y);
    }
}
