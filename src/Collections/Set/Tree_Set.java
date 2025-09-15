package Collections.Set;

import java.util.TreeSet;
class Point implements Comparable{
    int x;
    int y;
    Point(int x, int y){
        this.x=x;
        this.y=y;
    }
    public int compareTo(Object o){
        Point p= (Point)o;
        if (this.x<p.x) return -1;
        else if (this.x>p.x)return 1;
        else if (this.y<p.y)return -1;
        else if (this.y>p.y)return 1;
        else return 0;
    }
    public String toString(){
        return x+","+y+" ";
    }
}
public class Tree_Set {
    public static void main(String[] args) {
        TreeSet<Point> ts= new TreeSet<>();
        ts.add(new Point(1,2));
        ts.add(new Point(2, 5));
        ts.add(new Point(5, 1));
        ts.add(new Point(2, 1));
        ts.add(new Point(1, 1));
        ts.add (new Point(1, 3));

        System.out.println(ts);
    }
}
