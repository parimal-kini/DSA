package com.parimalkini;

import java.util.Scanner;

public class MinimumAndMaximun_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 numbers to compare : ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        int min = minimum(n1, n2, n3);
        int max = maximum(n1, n2, n3);
        System.out.println("Minimum : "+min);
        System.out.println("Maximum : "+max);
    }

    static int minimum(int n1, int n2, int n3){
        if(n1<n2 && n1<n2)
            return n1;
        else if(n2<n1 && n2<n3)
            return n2;
        else
            return n3;
    }

    static int maximum(int n1, int n2, int n3){
        if(n1>n2 && n1>n2)
            return n1;
        else if(n2>n1 && n2>n3)
            return n2;
        else
            return n3;
    }
}
