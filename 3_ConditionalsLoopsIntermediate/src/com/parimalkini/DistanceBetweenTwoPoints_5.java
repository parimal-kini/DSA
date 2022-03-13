package com.parimalkini;

import java.util.Scanner;

public class DistanceBetweenTwoPoints_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the co-ordinates of first point : ");
        float x1=scanner.nextFloat();
        float y1=scanner.nextFloat();

        System.out.print("Enter the co-ordinates of second point : ");
        float x2=scanner.nextFloat();
        float y2=scanner.nextFloat();

        double distance = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));

        System.out.println("The distance between given points is : "+distance   );
    }
}
