package OOJ.Interfaces;

abstract class phone {
    abstract void Call();
    abstract void SMS();
}
 interface Icamera{
    void Click();
    void Record();
}
interface IMusic{
    void Play();
    void Pause();
}
class smartPhone extends phone implements Icamera,IMusic{
    void Call(){
        System.out.println("Calling from Smart Phone");
    }
    void SMS(){
        System.out.println("Send SMS From Smartphone");
    }
    public void Click(){
        System.out.println("Click from SmartPhone");
    }
    public void Record(){
        System.out.println("Recording from Smartphone");
    }
    public void Play(){
        System.out.println("Playing from Smartphone");
    }
    public void Pause(){
        System.out.println("Music Paused");
    }
}
public class intro_Interfaces {
    public static void main(String[] args) {
        smartPhone sp =new smartPhone();
        sp.Call();
        sp.Click();
        sp.Play();
    }
}
