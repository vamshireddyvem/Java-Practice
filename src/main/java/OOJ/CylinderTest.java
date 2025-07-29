package OOJ;
class Cylinder{
    public double radius;
   public  double height;
    double LidArea(){
        return Math.PI*radius*radius;
    }
    double TotalSurfaceArea(){
        return 2*LidArea()+Circumfurance()*height;
      
    }
    double Circumfurance(){
        return 2*Math.PI*radius;
    }
    }


public class CylinderTest {
    public static void main(String args[]){
        Cylinder c1=new Cylinder();
        c1.radius=5;
        c1.height=15;
        System.out.println(c1.LidArea());
        System.out.println(c1.Circumfurance());
        System.out.println(c1.TotalSurfaceArea());
    }
}
