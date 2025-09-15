package OOJ.Constructors;

public class Cylinder {
    private double radius;
    private double height;
    public double getRadius(){
        return radius;
    }
    public void setRadius(double r){
       radius=r;
    }
    public double getHeight(){
        return height;
    }
    public void setHeight(double h){
       height=h;
    }
    public Cylinder(){
        height=radius=1;
    }
    public Cylinder(double h ,double r){
        height=h;
        radius=r;
    }
    public double Voulme(){
        return 2*Math.PI*getRadius()*getRadius()*getHeight();
    }
}
class CylinderArea{
    public static void main(String[] args) {
        Cylinder cy=new Cylinder(6,2);
        System.out.println(cy.Voulme());
    }    
}