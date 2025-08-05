class beerSong{
    public static void main(String[] args) {
        int Num=99;
        String word="Bottles";
        
        while(Num>0){
            System.out.println(Num+" "+word+" "+"of beer on the table");
            System.out.println(Num+" "+word+" "+"of beer");
            System.out.println("Take one Down");
            System.out.println("Pass it Around");
            Num=Num-1;
            if (Num==1) {
                word="bottle";
            }
            else if(Num==0){
                    System.out.println("NO More Beers on the Table");
                }
            }
        }
    }
