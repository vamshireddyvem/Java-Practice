package OOJ;

class Rectangle{
public double length;
public double bredth;
public double Area(){
    return length*bredth;
}
public double Perimeter(){
    return 2*(length+bredth);
}
public boolean IsSquare()
{
    if(length==bredth){
        return true;
    }
    return false;
}
}

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle r1= new Rectangle();
        r1.length=5;
        r1.bredth=5;
        System.out.println(r1.Area());
        System.out.println(r1.Perimeter());
        System.out.println(r1.IsSquare());
    }
}
