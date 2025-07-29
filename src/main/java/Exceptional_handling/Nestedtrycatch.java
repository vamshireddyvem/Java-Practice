package Exceptional_handling;
class Nestedtrycatch{
    public static void main(String[] args) {
        int arr1 []={10,0,20,30,40,50,60};
        try {
            int c=arr1[0]/arr1[2];
            System.out.println(c);
            try{
            System.out.println(arr1[0]);
            }
            catch(IndexOutOfBoundsException e){
                System.out.println("exceeded beyond the array size");
            }
        }
        catch (ArithmeticException e) {
            System.out.println("denominator is Zero cannot be defined");
        }
        System.out.println("we can have multiple catch for a try block and we can have nested try and catch as well it depends upon the useage");
    }
}
