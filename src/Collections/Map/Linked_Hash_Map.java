package Collections.Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class Linked_Hash_Map {
    public static void main(String[] args) {
        LinkedHashMap <Integer, String>lhm= new LinkedHashMap<>(5,0.75f,true){
            protected boolean removeEldestEntry(Map.Entry e){
                return size()>5;
            }
        };

        lhm.put(1, "hi");
        lhm.put(2, "hello");
        lhm.put(3, "namasthe");
        lhm.put(4, "Adab");
        lhm.put(5, "HI");
        lhm.put(6, "namsete");
        String s= lhm.get(4);

        System.out.println(lhm);

    }
}
