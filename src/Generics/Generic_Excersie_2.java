
class MyArray<T>{
    T user[]= (T[])new Object[10];
    int count;
    void append(T v){
        user[count++]=v;
    }
    void display(){
        for(int i=0; i<count;i++){
            System.out.println(user[i]);
        }
    }
}

public class Generic_Excersie_2 {
    public static void main(String[] args) {
        MyArray<String> ma= new MyArray<>();
        ma.append("hi");
        ma.append("Hello");
        ma.append("jij");
        ma.display();
    }
}
