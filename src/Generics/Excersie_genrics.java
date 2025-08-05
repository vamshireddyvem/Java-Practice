class Pair<T extends Number,U extends Number>{
    T first;
    U second;

    public Pair(T first, U second){
        this.first= first;
        this.second=second;
    }
    public T getfirst(){
        return first;
    }
    public U getsecond(){
        return second;
    }
    public Double Sum(){
        return first.doubleValue()+second.doubleValue();
    }
    public Pair<U,T> SwapPair(){
        return new Pair<>(second, first);
    }
    public String toString(){
        return "("+first+" "+second+")";
    }
    public String toString2(){
        return ""+first+" + "+second+" = "+Sum();
    }

    public static void main(String[] args) {
    Pair<Integer, Integer> origPair= new Pair<>(123, 564);
    System.out.println("Original Pair "+ origPair.Sum());
    System.out.println(""+origPair.toString2());
    // Pair<Integer, Integer> SwapPair= origPair.SwapPair();
    // System.out.println("Swapped Pair"+ SwapPair);
    origPair.Sum();
    origPair.toString2();
    }
}