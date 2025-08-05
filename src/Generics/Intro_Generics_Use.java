package Generics;

class Intro_Generics_Use<T>{
 @SuppressWarnings("unchecked")
 T user[]=(T[])new Object[3];

    public static void main(String[] args) {
    Intro_Generics_Use <String> d= new Intro_Generics_Use<>();
    d.user[0]="Hi";
    d.user[1]="2";
    // d.user[2]=10;
    }
}