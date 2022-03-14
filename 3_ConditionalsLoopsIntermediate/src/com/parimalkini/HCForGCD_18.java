package com.parimalkini;

import java.util.Scanner;

public class HCForGCD_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd number : ");
        int num2 = sc.nextInt();
        int hcf=0;

        for (int i=1; i<=num1 || i<=num2; i++){
            if(num1%i==0 && num2%i==0)
                hcf = i;
        }
        System.out.println("HCF of "+num1+" and "+num2+" is : "+hcf);
    }
}
