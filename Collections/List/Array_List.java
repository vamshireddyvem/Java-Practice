package Collections.List;
import java.util.*;

public class Array_List {
    public static void main(String[] args) {
        ArrayList<Integer> al1= new ArrayList<>(20); 
        ArrayList<Integer> al2 =new ArrayList<>(List.of(20,15,61,415,85));
        al1.add(5);
        al1.add(15);
        al1.add(51);
        al1.add(115);
        al1.add(511);
        al1.addAll(5,al2);
        al1.add(10, 5699);
        al1.set(9, 56);
        // al1.retainAll(al2);
        // System.out.println(al1.get(5));
        // System.out.println(al1.get(9));
        for(int i=0; i<al1.size();i++){
            System.out.print(al1.get(i));
        }
        System.out.println();
        al1.forEach((x)->System.out.print(x));
        for (Integer integer : al1) {
            System.out.println(integer);
        }
        ListIterator<Integer> it=al1.listIterator();it.hasNext();
        while(it.hasNext())
        System.out.print(it.next());

        
    }
}
