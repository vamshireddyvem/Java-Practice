package Arrays;

public class jagged2DArray {
    public static void main(String[] args) {
        int a[][]={{1,2,3,4,5,6},{7,8,9,4,5,6,6,6,666,6},{9,9,9,2,3,4,7,9,9,9}};
        int vam[][]=new int[3][9];
        for (int x[]:vam){
            for (int y : x) {
                System.out.print(y+" ");
            }
            System.out.println("");
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]+""); 
            }
            System.out.println("");    
        }
    }
}
