import java.util.*;
public class website{
    public static void main (String args[]){
        String protocol,url;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter url");
            url=sc.nextLine();
        }
        protocol = url.substring(0, url.indexOf(':'));
        if (protocol.equals("https")){
            System.out.println("Hyper-Text Protocol Secure");
        }    
        else if (protocol.equals("ftp")) {
            System.out.println("File Transfer Protocol");
        }
        else if (protocol.equals("http")) {
            System.out.println("Hyoer-Text Protocol");
        }
        String ext=url.substring(url.lastIndexOf('.')+1);
        if (ext.equals("com")){
            System.out.println("Domain= Commerical");
        }
        else if( ext.equals("net")){
            System.out.println("Domain= Network");
        }
        else if(ext.equals("gov")){
            System.out.println("Domain= Government");
        }
        else if(ext.equals("org")){
            System.out.println("Domain= Organization");
        }
        else if (ext.equals("edu")) {
            System.out.println("Domain= Education");
        }
    } 
}