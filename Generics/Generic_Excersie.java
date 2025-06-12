package Generics;
class InnerGeneric_Excersie <T>{ 
T Data;
void setData(T Data){
    this.Data= Data;
}
T getData(){
    return Data;
}
    
}
public class Generic_Excersie {
    public static void main(String[] args) {
    InnerGeneric_Excersie <String> d= new  InnerGeneric_Excersie<String>(); 
    d.setData("all");
    String str= d.Data;
    System.out.println(str);
    System.out.println(d.getData());    
    }


}
