package Collections;

import java.util.BitSet;

public class Bit_Set {
    public static void main(String[] args) {
        BitSet bs= new BitSet();
        bs.set(0);
        bs.set(1);
        bs.set(2);
        bs.set(5);
        bs.set(7);
        bs.set(10);

        BitSet bs1= new BitSet();
        bs1.set(2);
        bs1.set(3);
        bs1.set(4);
        bs1.set(5);
        bs1.set(8);
        bs1.set(9);
        bs.and(bs1);
        bs.or(bs1);
        System.out.println(bs);

    }
}
