package com.parimalkini;

import java.util.Scanner;

public class FibonacciSeries_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number upto where you want to print : ");
        int n = sc.nextInt();

        fibonacci(n);
    }
    static void fibonacci(int n){
        int n1=0, n2=1, n3=0;
        while (n>0){
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.println(n3+" ");
            n--;
        }
    }
}
