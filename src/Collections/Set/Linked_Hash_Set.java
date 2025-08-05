package Collections.Set;

import java.util.LinkedHashSet;

public class Linked_Hash_Set {
    public static void main(String[] args) {
        LinkedHashSet <String>lhs= new LinkedHashSet<>();
        lhs.add("hi");
        lhs.add("Adab");
        lhs.add("hello");
        lhs.add("namaste");
        lhs.addFirst("Hey");
        System.out.println(lhs);
    }
}
