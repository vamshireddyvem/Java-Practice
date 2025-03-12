package OOJ;

class Student {
   private String RollNo;
        public String getRollNo(){
            return RollNo;
        }
        public String setRollNo(String r){
            return RollNo=r;
        }
    private String Name;
        public String getName(){
            return Name;
        }
        public String setName(String n){
             return Name=n;
        }
   private String Course;
        public String getCourse(){
            return Course;
        }
        public String setCourse(String c){
            return Course=c;
        }
    public int sub1,sub2,sub3,sub4,sub5,sub6;
    public int Total(){
        return sub1+sub2+sub3+sub4+sub5+sub6;
    }

    public Double Average(){
        return (double) (Total()/6);
    }
    public String Grade(){
        if(Total()>500){
            return"Grade A";
        }
        if(Total()>400){
            return"Grade B";
        }
        if(Total()>300){
            return"Grade C";
        }
        if(Total()>200){
            return"Grade D";
        }
       return "Grade F";
    }
    public String details(){
        return "Roll.No= "+RollNo+"\n"+"Name= "+Name+"\n"+"Course= "+Course+"\n";
    }
}
public class StudentTest{
    public static void main(String[] args) {
        Student s1=new Student();
        s1.setName("Jinsu");
        s1.setRollNo("12A56");
        s1.setCourse("MPC");
        s1.sub1=94;
        s1.sub2=95;
        s1.sub3=87;
        s1.sub4=93;
        s1.sub5=93;
        s1.sub6=91;
        System.out.println(s1.details());//toString():methods calls directly the object itself by using refernce//
        System.out.println(s1.Grade());
        System.out.println(s1.Average());
        System.out.println(s1.Total());
    }
}
