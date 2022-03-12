package com.parimalkini;

import java.util.Scanner;
import java.util.SortedMap;

public class TwoNumsAndOperator_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers : ");;
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Enter the operator : ");
        char ch = sc.next().charAt(0);

        if(ch == '+')
            System.out.println(a+b);
        else if(ch == '-')
            System.out.println(a-b);
        else if(ch == '*')
            System.out.println(a*b);
        else if(ch == '/')
            System.out.println(a/b);
        else if(ch == '%')
            System.out.println(a%b);
    }
}
