

public class PharseOMatic {
    public static void main (String[] args){
        //make three sets of words to chose from
        String[] wordListOne={"Vamshi","Jinsu","Dhanush","Maneesh","Kushullu","Shivadhar","Shiva Ganesh"};
        String [] wordListTwo={"is a good boy","is smart","is Intelligent","is handsome","is nice guy","loverboy"};
        String [] wordListThree={"1","3","4","6","5","2"};

        //find out the length of the words in each list
        int oneLength=wordListOne.length;
        int twoLength=wordListTwo.length;
        int threelength=wordListThree.length;

        //generate three random numbers
        int ran1=(int) (Math.random()*oneLength);
        int ran2=(int)(Math.random()*twoLength);
        int ran3=(int)(Math.random()*threelength);

        //now build the phrase
        String Phrase=wordListOne[ran1]+" "+wordListTwo[ran2]+" "+wordListThree[ran3];

        //print the phrase
        System.out.println(Phrase);
    }
}
