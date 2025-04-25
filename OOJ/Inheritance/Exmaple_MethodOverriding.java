package OOJ.Inheritance;
class Phone{
    public void makeCall(){
        System.out.println("Calling");
    }
    public void hangUpCall(){
        System.out.println("Call HangedUp");
    }
    public void answerCall(){
        System.out.println("Call Answered");
    }
}
class Smartphone extends Phone{
    public void makeCall(){
        System.out.println("Calling with Smart Phone");
    }
    public void hangUpCall(){
        System.out.println("Call HangedUp in Smart Phone");
    }
    public void answerCall(){
        System.out.println("Call Answered in Smart Phone");
    }
    public void playMusic(){
        System.out.println("Music Playing");
    }
    public void pauseMusic(){
        System.out.println("Music Paused");
    }
    public void forwardMusic(){
        System.out.println("Next Song");
    }
}
public class Exmaple_MethodOverriding {
    public static void main(String[] args) {
        Phone p= new Phone();
        p.makeCall();
        Smartphone sp= new Smartphone();
        sp.playMusic();
        Phone p2= new Smartphone(); // dynamic method dispatch
        p2.answerCall();
    }
}
