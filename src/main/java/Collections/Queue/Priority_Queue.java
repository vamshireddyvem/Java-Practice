package Collections.Queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Priority_Queue {
    public static void main(String[] args) {
        PriorityQueue <Integer> pq= new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(15);
        pq.add(20);
        pq.add(5);
        pq.add(20);
        pq.add(30);
        pq.add(10);
        pq.add(25);
        System.out.println(pq.peek());
        pq.forEach((x)->System.out.print(x+" "));
        pq.poll();
        System.out.println("After deletion peek");
        System.out.println(pq.peek());
        pq.forEach((x)->System.out.print(x+" "));


    }
}
