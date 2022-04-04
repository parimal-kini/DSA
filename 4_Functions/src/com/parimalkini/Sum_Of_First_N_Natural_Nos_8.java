package com.parimalkini;

import java.util.Scanner;

public class Sum_Of_First_N_Natural_Nos_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = scanner.nextInt();

        System.out.println("Sum of all numbers upto "+n+"is : "+sum(n));
    }
    static int sum(int n){
        int sum=0;
        for(int i=0; i<=n; i++){
            sum+=i;
        }
        return sum;
    }
}
