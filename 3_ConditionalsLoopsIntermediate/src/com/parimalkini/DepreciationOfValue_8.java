package com.parimalkini;

import java.util.Scanner;

public class DepreciationOfValue_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount : ");
        int amt = scanner.nextInt();
        System.out.print("Enter the rate of depreciation : ");
        int depRate = scanner.nextInt();
        System.out.print("Enter the time period : ");
        int time = scanner.nextInt();

        int depValue=amt;
        for(int i=0; i<time; i++){
            depValue = ((100-depRate)*amt)/100;
        }

        System.out.println("The value of "+amt+" after "+time+" years is : "+depValue);
    }
}
