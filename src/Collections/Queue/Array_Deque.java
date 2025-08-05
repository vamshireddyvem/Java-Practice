package Collections.Queue;

import java.util.ArrayDeque;
import java.util.List;

class Array_Deque{
    public static void main(String[] args) {
        ArrayDeque<String> names= new ArrayDeque<>(List.of("Vamshi", "Jinsu", "Hari", "Prasad", "Vishnu", "Arjun"));
        ArrayDeque<Integer> nos= new ArrayDeque<>(2);
        // nos.removeFirst();
        nos.pollFirst();
        nos.addFirst(1);
        nos.addLast(3);
        nos.addLast(7);
        names.addFirst("super");
        names.pollFirst();
        names.offerFirst("Hi");
        names.removeFirst();
        names.peekFirst();
        int result= nos.peekFirst()-nos.peekLast();
        names.forEach((x)->System.out.println(x));
        nos.forEach((y)->System.out.println(y));
        System.out.println(result);

    }
}