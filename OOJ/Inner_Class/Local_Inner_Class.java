package OOJ.Inner_Class;
 class  we{
void outerdisplay(){
    System.out.println("OuterDisplay");
    class my{
        void mydisplay(){
            System.out.println("Local Inner Class");
        }
    }
  new my().mydisplay(); // we can call innerclass using anonmyous object without having reference
    // my mine =new my(); 
    // mine.mydisplay(); 
    }
}
public class Local_Inner_Class {
    public static void main (String args[]){
        we w= new we();
        w.outerdisplay();
    }
}
