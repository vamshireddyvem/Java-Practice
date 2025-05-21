/**
 * @author Vamshidhar Reddy Vem 
*/
package javdoc;
/**
 * @since 5/20/2025
*/
public class Student12{
    String Name;
    int rollNo;
    String Dept;
    int total;
    /**
     * Subject marks
     * @param a marks of subject A
     * @param b marks of subject B
     * @param c marks of subject C
     * @return returns totalmarks
     */
    public int totalmarks(int a, int b, int c){
        total=a+b+c;
        return total;
    }
    /**
     * Getting the Roll No of the Student
     * @param rollNo
     */
    public void getRollno(int rollNo){
        this.rollNo=rollNo;
    }
    public void getDept(String Dept){
        this.Dept=Dept;
    }
    
    public void display(){
        System.out.println(Name+" "+rollNo+" "+total);
    }
    /**
     * Student constructor
     * @param Name it is the Name of the Student.
     * @param rollNo it is the Roll No of the Student.
     * @param Dept its the Students Department.
     */
    Student12(String Name, int rollNo, String Dept){
        this.Name=Name;
        this. rollNo=rollNo;
        this.Dept=Dept;
    }
}


