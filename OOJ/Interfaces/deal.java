package OOJ.Interfaces;
interface member{
    void callBack();
}
class store{
    member mr[]= new member[10];
    int count=0;
    void register(member m){
    mr[count++]=m;
    }
    void invitesale(){
        for(int i=0;i<count;i++){
            mr[i].callBack();
        }
    }
}

class customer implements member{
    String name;
    customer(String name){
    this.name=name;
    }
    public void callBack(){ 
        System.out.println("We Have a Deal of 50% OFF "+name+" Please Come and get the Eclusive deal");
    }
}
public class deal {
    public static void main(String[] args) {
        store w= new store();
        customer v= new customer("Vamshi");
        customer j= new customer("Jinsu");
        w.register(v);
        w.register(j);
        w.invitesale();
    }
}
