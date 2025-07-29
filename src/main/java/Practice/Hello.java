class hello{
    public static void main(String a[]){
        System.out.println("Hello Vamshi");
        int num1 = 3;
        int num2 = 6;
        int Add = num1 + num2;
        System.out.println(Add);
        String vam = "vamshi vem";
        String resultv= Add + vam;
        System.out.println(resultv);

        //DATA TYPES//
        int no= 9;
        long L=56885l;
        short sh=239;
        byte by= 127;

        double db= 687.4;
        float Fl= 5.4f;

        char c ='L';

        Boolean k =true;

        //Literals//

        int no1=76;
        System.out.println(no1);

        int no2=0b101;
        System.out.println(no2);

        int no3=0x5E;
        System.out.println(no3);

        double no4=13e10;
        System.out.println(no4);

        double no5=78;
        System.out.println(no5);

        char m='k';
        System.out.println(m);
        char mn='k';
        mn++;
        System.out.println(mn);


        //Type Conversion and Casting//

        byte v=127;
        int q= 256; //here the modulos of the 256 is converted by dividing the q value to range of a bye//
        v=(byte)q;  //Casting: Explits the value from bigger value into smaller//
        System.out.println(v);

        int b=347;
        long g=b;
        System.out.println(g); // Coversion: Implicts the smaller type into Bigger Type// 

        float p= 23.6f;
        int w= (int)p;  //by coverting decimal into integers there will be a loss of data after the point in decimals//
        System.out.println(w);

        byte e = 12;
        byte o =127;
        int t=e*o; //Type Promotion: Here the 2 values of byte data type is promoted when they are multiplied they exceed the range of Byte so they can be stored in integer//
        System.out.println(t);


        int num3= 56;
        int num4= 67;
        int res=(num3+num4); //We can use all Arthemmatic Operations like +,-,*./,&
        System.out.println(res);

        int num5=45;
        int num6=5;
        int resul= num5/num6; // gives the Coefficient as result
        System.out.println(resul);

        int num7=46;
        int num8=5;
        int resultm=num7%num8;//Modulos Operator gives the remainder as the result
        System.out.println(resultm);
    
        int num9=23;
        num9++; // Post -Increment/ Decerement
        //num9--; 
        System.out.println(num9);

        int num10= 14;
        ++num10;
        --num10;
        System.out.println(num10);

        int num11=5;
        int x=num11++; // here Post-Increment the value of the variable num11 is fetched and Increments
        System.out.println(x);

        int num12=5;
        int y=++num12;  // here Pre-Increment as the num12 is incremented and Fetched
        System.out.println(y);

        //Regional Operators
        //<,>,==,<=,>=,!=//
        int d=7;
        int z=8;
        //Boolean i= w<z;
        // Boolean i= w<=z;
        // Boolean i= w>=z;
        Boolean i= w>z;
        // Boolean i= w==z;
        // Boolean i= w!=z;
        
        System.out.println(i);

        //Logical Operators
        int h=12;
        int f= 20;
        int r= 24;
        int j= 45;

        Boolean results=(h<f)&&(r>j);
        Boolean resultq= (h>f)||(r<j);
        Boolean resultw=!results;
        System.out.println(results);
        System.out.println(resultq);
        System.out.println(resultw);

        //Conditional Statements
        int as=56;
        int sa=65;
        if (as>sa)
        System.out.println(as);
        else
        System.out.println(sa);

        int aas=56;
        int saa=65;
        if (aas>saa)
        { // While passig the 2 statements we have to use Curly {}braces
            System.out.println(aas);
            System.out.println("Hello Vamshi its True");
        }
        else
        { // While passig the 2 statements we have to use Curly {}braces
        System.out.println(saa);
        System.out.println("Sorry its False");
        }

        //Conditional statements using three user Variables

        int er=12;
        int rt=13;
        int ty=14;
        if(er>rt && er>ty)
        {
            System.out.println(er);
            System.out.println("er is the Greatest");
        }
        else if(rt>er && rt>ty){
            System.out.println(rt);
            System.out.println("rt is the Greatest");
        }
        else
        {
            System.out.println(ty);
            System.out.println("ty is the greatest");
        }
        //Ternay Operator ?:

        int mon=10;
        String rels= (mon%2==0)?"Even":"Odd";
        System.out.println(rels);

        //Switch & Break

        int week =15; // Here once the switch is on it gives all cases inorder break the switch use break
        switch(week){
        case 1:
            System.out.println("Monday");
             break;
        case 2:
            System.out.println("Tuesday");
                break;
        case 3:
            System.out.println("Wednesday");
                break;
        case 4:
            System.out.println("Thursday");
                break;
        case 5:
            System.out.println("Friday");
                break;
        case 6:
            System.out.println("Saturday");
                break;
        case 7:
            System.out.println("Sunday");
                break;
        default:
            System.out.println("Enter Valid week");
                break;
        }

        String day="Saturday";
        String Alarm="";
        Alarm=switch(day){
        case  "Friday", "Saturday": yield "9Am";
        default:yield"6Am";
        };
        System.out.println(Alarm);

        //Loops: this comes when we need to iterate/repeats with some condition or not

        int in=1;
        while(in<=10)
        {
            System.out.println("No "+ in);
            
            if(in>5 && in<=10){
                System.out.println("Vamshi...");
            }
            in++;
        }
        int ne=5;
        do { 
            System.out.println("No "+ ne);
            ne++;
        } while (ne<=4);

        for (int key = 1; key <= 7; key++) {
            System.out.println("Day " +key);
            }
    }
}