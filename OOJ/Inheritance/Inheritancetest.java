package OOJ.Inheritance;
class Recatangle{
public int length;
public int breadth;
Recatangle(int length, int breadth){
    this.length=length;
    this.breadth=breadth;
}
    public int Area(){
    return length*breadth;
    }
    public int Perimeter(){
    return 2*(length+breadth);
    }
}
class Cubiod extends Recatangle {
public int height;
Cubiod(int length, int breadth, int height){
    super(length,breadth);
    this.height=height;
}
public int Volume(){
    return Area()*height;
}
public int SurfaceArea(){
    return 2*((length*breadth)+(breadth*height)+(height*length));
}
}
public class Inheritancetest {
    public static void main(String[] args) {
        Cubiod c1=new Cubiod(10, 5, 15);
        System.out.println(c1.Volume());

    }
}
