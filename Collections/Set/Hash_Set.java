package Collections.Set;

import java.util.HashSet;

public class Hash_Set {
    public static void main(String[] args) {
        HashSet<Integer>hs=new HashSet<>();
        hs.add(25);
        hs.add(5);
        hs.add(5);
        hs.add(15);
        hs.add(10);
        hs.add(20);
        System.out.println(hs);
        hs.forEach((x)->System.out.println(x));
        
    }
    
    
}
