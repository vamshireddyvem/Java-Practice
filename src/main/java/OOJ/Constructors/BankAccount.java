package OOJ.Constructors;

public class BankAccount {
    private String AccNo;
    private String AcName;
    private String Address;
    private String Phno;
    private long Balance;

    public String getAccNo( String AccNo){
        return AccNo;
    }
    public String  getAcName( String  AcName){
        return AcName;
    }
    public String getAddress( String Address){
        return Address;
    }
    public String getPhno( String Phno){
        return Phno;
    }
    public long getBalance(long Balance){
        return Balance;
    }
    public String setPhno( String Phno){
        return this.Phno=Phno;
    }
    public String setAddress( String Address){
        return this.Address=Address;
    }
    public String setAcName( String AcName){
        return this.AcName=AcName;
    }
    public String setAccNo( String AccNo){
        return this.AccNo=AccNo;
    }
    public long setBalance(long Balance){
        return this.Balance=Balance;
    }
    public BankAccount(String AcName, String Address, long Balnace, String Phno, String AccNo ){
        this.AcName=AcName;
        this.AccNo=AccNo;
        this.Address=Address;
        this.Balance=Balnace;
        this.Phno=Phno;
    }
    public long Credit;
    public long Debit;
    public long Balance (){
        return Credit+Balance-Debit;
    }
}
class BankAcTest{
    public static void main(String[] args) {
        BankAccount Ji= new BankAccount("Jinsu Abraham", "5500 McKinney Place Dr", 0, "9453480509", "05978164");
        Ji.Credit=100;
        System.out.println(Ji.Balance());
        Ji.Debit=25;
        System.out.println(Ji.Balance());

    }
}
