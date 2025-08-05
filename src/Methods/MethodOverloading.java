package Methods;


public class MethodOverloading {
    static int Area(int x, int y){
        System.out.print("Area of a Rectangle is ");
        return ((x*y));
    }
    static double Area(double r){
        System.out.print("Area of a Circle is ");
        return(Math.PI*r*r);
    } 
    static int Area (int x, int y, int z){
        System.out.print("Area of a Trapezoid is ");
        return((x+y)/2*z);
        
    }
    public static void main(String args[]){
        System.out.println(Area(5, 10, 2));
        System.out.println(Area(5.5));
        System.out.println(Area(10,6));
    }
}
