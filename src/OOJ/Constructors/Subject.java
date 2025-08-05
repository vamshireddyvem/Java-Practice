package OOJ.Constructors;

public class Subject {
    private String subId;
    private String subName;
    private int maxMarks;
    public Subject(String subId, String subName, int m){
        this.subId=subId;
        this.subName=subName;
        setmaxMarks(m);
    }
    public String getsubID (){
        return subId;
    }
    public String getsubName (){
        return subName;
    }
    public int getmaxMarks (){
        return maxMarks;
    }
  
    public void setmaxMarks(int m){
        maxMarks=m;
    }
    void display(){
        System.out.println(subId+" "+subName+" "+maxMarks);
    }
    public String toString(){
        return "\n Sub ID:"+subId+" \n Subject Name:"+subName;
    }
}

class Student2{
    public static void main(String[] args) {
        Subject subs[]=new Subject[3];
        subs[0]=new Subject("IS25101", "Java", 100);
        subs[1]=new Subject("IS25102", "React", 100);
        subs[2]=new Subject("IS25103", "Maketing", 100);
        for (Subject s:subs){
            System.out.println(s);
        }
    }
}
