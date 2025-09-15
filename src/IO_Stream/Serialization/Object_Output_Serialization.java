package Serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class student2 implements Serializable{
    int RolNo;
    float Average;
    String FName;
    String Depart;

    String display(){
        return "Student Details are "+"\n"+FName+"\n"+RolNo+"\n"+Depart+"\n"+Average+"\n";
    }
    student2(){

    }
    student2(String FName, String Depart, int RolNo, float Average){
        this.FName=FName;
        this.Depart=Depart;
        this.RolNo=RolNo;
        this.Average=Average;
    }
}

public class Object_Output_Serialization {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("E:\\JAVA Course\\Filesource\\student4.txt");
        ObjectOutputStream oos= new ObjectOutputStream(fos);
        student2 s= new student2("Sai", "CSE", 159, 52.4f);
        oos.writeObject(s);
        fos.close();
        oos.close();
    }
    
}
