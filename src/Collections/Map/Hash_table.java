package Collections.Map;

import java.util.Hashtable;

public class Hash_table {
    public static void main(String[] args) {
        Hashtable<Integer, String > ht= new Hashtable<>();
        ht.put(1, "ji");
        ht.put(2, "jhej");
        ht.put(3, "jioufh");
        ht.compute(2, (k,v)->v+"jnkl");
        System.out.println(ht);
    }
}
