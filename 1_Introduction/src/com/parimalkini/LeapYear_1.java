package com.parimalkini;

import java.util.Scanner;

public class LeapYear_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the year you want to check : ");
        int year = scanner.nextInt();
        check(year);
    }
    static void check(int year){
        if( ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
            System.out.println(year+" is a leap year");
        else
            System.out.println(year+" is not a leap year");
    }
}
