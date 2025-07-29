package Collections.Map;

import java.util.HashMap;
import java.util.Map;

public class Hash_Map {
    public static void main(String[] args) {
        HashMap<Integer,String>hm= new HashMap<>(Map.of(1, "Hi", 2, "This", 3, "is Krish"));
        hm.put(4, "How");
        hm.put(5, "are");
        hm.put(6, "you");
        System.out.println(hm);
        System.out.println(hm.get(5));
        System.out.println(hm.size());
    }
}
