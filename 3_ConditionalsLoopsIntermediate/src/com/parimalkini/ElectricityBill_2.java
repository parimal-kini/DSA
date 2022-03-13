package com.parimalkini;
//        1 to 100 units – Rs. 10/unit
//        100 to 200 units – Rs. 15/unit
//        200 to 300 units – Rs. 20/unit
//        above 300 units – Rs. 25/unit

import java.util.Scanner;

public class ElectricityBill_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of units consumed in one month : ");
        int units = scanner.nextInt();
        double bill = 0;

        if(units<=100)
            bill = units*10;
        else if(units<=200)
            bill = (100*10)+(units-100)*15;
        else if(units<=300)
            bill=(100*10)+(100*15)+(units-200)*20;
        else
            bill=(100*10)+(100*15)+(100*20)+(units-300)*25;

        System.out.println("Electricity bill for "+units+" is : "+bill);
    }
}
