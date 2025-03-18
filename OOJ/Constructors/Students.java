package OOJ.Constructors;

// Still Needs to work it not showing the array subjets in Output;

public class Students {
    private String Name;
    private String rollNo;
    private String dept;
    private String Subject[];
    private int Marks;
    public Students(String Name,String rollNo,String dept, String []Subject,int Marks){
                this.Name=Name;
                this.rollNo=rollNo;
                this.dept=dept;
                setSubject(Subject);
                setMarks(Marks);
    }
    public String getName() {
        return Name;
    }
    public String getRollNo() {
        return rollNo;
    }
    public String getDept() {
        return dept;
    }
    public String[] getSubject() {
        return Subject;
    }
    public int getMarks() {
        return Marks;
    }
    
    public void setName(String Name) {
        this.Name = Name;
    }
    public void setMarks(int Marks) {
        this.Marks= Marks;
    }
    public void setSubject(String[] Subject) {
        this.Subject = Subject;
    }
    public String isPassed(){
        if (Marks>=100*40/100){
            return " PASS";
        }
        else if(Marks<100*40/100){
            return"  FAIL";
        }
        return " Invalid MArks";
    }
    public String toString(){
        return "Name: "+Name+"\n"+ "ROllNo: "+rollNo+"\n"+ "Dept: "+dept+"\n"+"Subject:"+Subject+"\n"+"Pass/Fail: "+isPassed();
    }
}
class Results{
    public static void main(String[] args) {
        
        Students stu1=new Students("Akshath", "15U61ACSE12", "CSE", args,67);
        Students stu2=new Students("Teja", "15U2DFGI", "MECH", args, 39);
        Subject java=new Subject("JP-15CS", "JAVA", 100);
        Subject python=new Subject("PY-13", "Python", 100);
        System.out.println(stu1.toString());
        //System.out.println(java.toString());
        // System.out.println(python.toString());
        System.out.println(stu2.toString());
    }
}
