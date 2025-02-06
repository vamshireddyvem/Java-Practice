public class StrMe {
   public static void main(String[] args) {
       String Str="vamshi@gmail.com";
       int i=Str.indexOf("@");
       String userName =Str.substring(0,i);
       System.out.println(userName);
       String domain=Str.substring(i+1,Str.length());
       System.out.println(domain);
       System.out.println(domain.compareTo("gmail.com"));
       
          }
       
       

    
    }

