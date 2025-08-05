package Collections.List;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Linked_List {
    public static void main(String[] args) {
        LinkedList<Integer> ll1 = new LinkedList<>(List.of(50, 45, 40, 35,30));
        LinkedList<Integer>ll2 = new LinkedList<>(List.of(25,20,15,10,5,0));
        ll2.addFirst(1);
        Iterator <Integer> it= ll2.iterator();
        while(it.hasNext())System.out.print(it.next());
        ll2.addLast(-2);
        ListIterator<Integer> it2= ll2.listIterator();
        while (it2.hasNext()) {
            System.out.print(it2.next());
        }
        System.out.println();
        Iterator<Integer> it3= ll1.descendingIterator();
        while (it3.hasNext()) {
            System.out.println(it3.next());
        }
        
        


        

    }
}
