public class game {
    player p1;
    player p2;
    player p3;
    public static void main(String[] args) {
        p1=new player();
        p2=new player();
        p3=new player();

        int guess1=0;
        int guess2=0;
        int guess3=0;
        boolean p1 isRight =false;
        boolean p2 isRight=false;
        boolean p3 isRight =false;
        int targetNum =(int) (Math.random()*10);
        System.out.println("I am thinking of num b/w 0 to 9");
        p1.guess();
        p2.guess();
        p3=guess();
    }
    
}
