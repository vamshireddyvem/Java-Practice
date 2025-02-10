package Arrays;

public class ArraySort {
    public static void main(String[] args) {
        String A[]={"Maneesh","Kushullu","Prudhivi","jinsu","Shiva","Dhanush","Shivadhar","Vamshi"};
        java.util.Arrays.sort(A);
              
        for (String x : A) {
            System.out.println(x);
        }
    }
}
