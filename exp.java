public class exp {
    
        
    public static void main (String args[]){
        int b=1100;
        String hD="12LAB";
        String str =b+"";
        System.out.println(str.matches("[01]*"));
        System.out.println(hD.matches("[0-9 A-F]*"));
        String date="13/31/2024";
        System.out.println(date.matches("[0-1][0-9]/[0-3][0-9]/[0-9]{4}"));

        String sp="v@m$h!";
        String rmSp = sp.replaceAll(^[a-z][0-9],"");
        System.out.println(rmSp);
    }
}
