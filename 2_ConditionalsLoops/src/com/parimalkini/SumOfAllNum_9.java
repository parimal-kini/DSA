package com.parimalkini;

import java.util.Scanner;

public class SumOfAllNum_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number : ");
        int sum=0;
        while (true){
            int n = scanner.nextInt();
            sum += n;
            if(n==0)
                break;
        }
        System.out.println(sum);
    }
}
