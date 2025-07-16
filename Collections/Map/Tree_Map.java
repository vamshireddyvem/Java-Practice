package Collections.Map;

import java.util.Map;
import java.util.TreeMap;

public class Tree_Map {
    public static void main(String[] args) {
        TreeMap<Character, String> tm= new TreeMap<>(Map.of('A', "Hi", 'B', "Vamshi", 'C', "How"));
        tm.put('D', "Are");
        tm.put('E', "You");
        System.out.println(tm);
        System.out.println(tm.get('B'));
        System.out.println(tm.get('D'));
        System.out.println(tm.ceilingKey('F'));
        System.out.println(tm.floorKey('F'));

    }
}
