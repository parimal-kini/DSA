package com.parimalkini;

import java.util.Scanner;

public class UniqueIntegersSum0_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer : ");
        int n = sc.nextInt();
        findArray(n);
    }
    static void findArray(int n){
        for (int i = 1; i <= n / 2; i++)
            System.out.print(i + ", " + -i + ", "); // Print 2 symmetric numbers

        if (n % 2 == 1)// Print a extra 0 if N is odd
            System.out.print(0);
    }
}
