package Serialization;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Challenge_IOStream {
    public static void main (String args[]) throws IOException{
        Float List[]={1.25f,56.58f,23.46f,67.41f,78.21f};
        FileOutputStream fos= new FileOutputStream("E:\\JAVA Course\\Filesource\\Challenge.txt");
        DataOutputStream dos = new DataOutputStream(fos);
        dos.writeInt(List.length);
        for (float f:List){
            dos.writeFloat(f);
        }
        fos.close();
        dos.close();
        FileInputStream fis =new FileInputStream("E:\\JAVA Course\\Filesource\\Challenge.txt");
        DataInputStream dis = new DataInputStream(fis);
        int length= dis.readInt();
        float data;
        for(int i=0; i<length;i++){
            data=dis.readFloat();
            System.out.println(data);
        }
        fis.close();
        dis.close();
    }
}



