package OOJ.Abstract_Class;
abstract class shape{
    abstract double perimeter();
    abstract double Area();
    abstract void display();
}
class circle extends shape{
    double radius;
    double  Area(){
        return 2*Math.PI*radius*radius;
    }
    double perimeter(){
        return  2*Math.PI*radius;
    }
    void display(){
        System.out.println("Area of a circle "+Area()+"\n"+"Perimeter of A circle "+perimeter());
    }
    circle(double radius){
        this.radius=radius;
    }
}
class rectangle extends shape{
    double length;
    double breadth;
    double Area(){
        return length*breadth;
    }
    double perimeter(){
        return 2*(length+breadth);
    }
    void display(){
        System.out.println("Area of a Rectangle "+Area()+"\n"+"Perimeter of A Rectangle "+perimeter());
    }
    rectangle(double length,double breadth){
        this.length=length;
        this.breadth=breadth;
    }
}

public class Excersie_abstract {
    public static void main(String[] args) {
        shape c= new circle(5);
        c.display();
        shape r= new rectangle(5, 10);
        r.display();
    }
}
