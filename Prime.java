public class Prime {
 public static void main(String[] args) {
    int a=100, flag=0;
    for(int i=1;i<=a;i++)
    {
        flag=1;
        for(int x=2;x<=i/2;x++)
        {
            if(i%x==0)
            {
                flag=0;
                break;
            }
        }
        if(flag==1)
        {
            System.out.println(i);
        }
    }
 }
}
