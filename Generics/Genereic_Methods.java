package Generics;
class A<T>{}
class B<T> extends A<T>{}
class C extends B{}

class Mytest<T>{
   int count;
   <E>void display2(E... v){
        System.out.println(v);
   }
   void hellodisplay(Mytest <?>v){ // WildCard

   }
   void hidisplay(Mytest<? extends Number>g){ //upper bound

   }
   void namsatedisplay(B<? super A> e){ // Lower Bound

   }
}
public class Genereic_Methods {
   public static void main(String[] args) {
      Mytest<Integer> nt= new Mytest<>();
      nt.hellodisplay(nt);
   }

   
    
}