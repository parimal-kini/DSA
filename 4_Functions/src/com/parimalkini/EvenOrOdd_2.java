package com.parimalkini;

import java.util.Scanner;


public class EvenOrOdd_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int a = scanner.nextInt();
        boolean eo = evenOrOdd(a);
        if (eo)
            System.out.println(a+" is even");
        else
            System.out.println(a+" is odd");
    }
    static boolean evenOrOdd(int n){
        if(n%2 == 0)
            return true;
        else
            return false;
    }
}
