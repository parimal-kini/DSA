package com.parimalkini;

import java.util.Scanner;

public class CompoundInterest_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the principle amount : ");
        float p = sc.nextFloat();
        System.out.print("Enter the rate of interest : ");
        float r = sc.nextFloat();
        System.out.print("Enter the time period : ");
        float t = sc.nextFloat();
        //float n = p*(1+(r/100));
        float comInt = (float) (p*(Math.pow((1+(r/100)),t)));
        System.out.println("Amount after compound interest is : "+comInt);
    }
}
