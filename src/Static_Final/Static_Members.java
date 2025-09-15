package Static_Final;
class Phone{
    static double price=15;
    int a,b;
    void show(){
        System.out.println(price);
    }
    static double GrandTotal(String city){
        switch (city) {
            case "Hyd":
                return price=price+price*0.1;
            case "Goa":
                return price=price+price*0.05;
    
        }
        return price;
    }
    static double GrandTotal(String city, String Model){
        return price;
    }
}
class Static_Members{
    public static void main(String[] args) {
       Phone ip= new Phone();
       System.out.println(Phone.price);
       Phone.price=20;
       Phone.price=13;
       Phone.GrandTotal("Hyd");
       System.out.println(Phone.price);
       ip.show();
    }
}