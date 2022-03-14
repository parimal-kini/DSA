package com.parimalkini;

public class VarArgs1_10 {
    public static void main(String[] args) {
//        Overloaded functions called via different parameters
        display("Parimal", "Vaishnavi");
        display(1,2,3);
        display(69,"Parimal","Vaishnavi");
    }
    static void display(String... name){
//        For Loop to print names in var args
        for(String s:name)
            System.out.println(s+" ");
    }
//    Funtion oveerloading (different parameters)
    static void display(int... n){
        for(int i:n)
            System.out.println(i+" ");
    }
//     Funtion oveerloading (different parameters)
    static void display(int n, String... name){
            System.out.println(n);
        for( String s:name)
            System.out.print(s+" ");
    }
}
