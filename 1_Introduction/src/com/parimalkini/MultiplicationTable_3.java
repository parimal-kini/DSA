package com.parimalkini;

import java.util.Scanner;
import java.util.SortedMap;

public class MultiplicationTable_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        table(n);
    }
    static void table(int n){
        for (int i=1; i<=10; i++)
            System.out.println(n+" * "+i+" = "+(n*i));
    }
}
