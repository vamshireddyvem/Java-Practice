package Arrays;

class AddingArray{
public static void main(String args[]){
int A[][]={{5,2,7},{6,4,8},{2,3,4}};
int B[][]={{1,2,5},{5,7,9},{5,1,0}};
int C[][]=new int[3][3];
for (int i = 0; i < A.length; i++) {
        for (int j = 0; j < A[i].length; j++) {
            C[i][j]=A[i][j]+B[i][j];
        }
    }   

for(int x[]:C){
    for (int y:x){
    System.out.print(y+",");
    }
 System.err.println("");
}
}
}