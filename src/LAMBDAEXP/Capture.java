package LAMBDAEXP;
@FunctionalInterface
 interface Super {
    int  display(int a , int b);
}
class Hi {
    int bi ;
    void display(){
        int x=0;
        // a method variable are to to final or effectively final and cannot be changed in lambda exp
        Super hi=(a,b)->{
            System.out.println("fmnbnjdn");
            System.out.println("hi helo"+bi++);// we can modify instance variables /or the variabled of the class
            return a+b;// if thier is a single statement in lambda exp no need of return and flower brackets but if their are multiple statements in lambda exp we have to have flower brackets and  return
         };
        bi=bi++;
       
    }
}
    

public class Capture {
    public static void main(String[] args) {
        
    }
}

