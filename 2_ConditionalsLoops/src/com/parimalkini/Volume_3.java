package com.parimalkini;

import java.util.Scanner;

public class Volume_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a shape : ");
        String input = sc.next();

        switch (input) {
            case "cone" -> {
                System.out.println("Enter the height of cone : ");
                float heightC = sc.nextFloat();
                System.out.println("Enter the radius of cone : ");
                float radiusC = sc.nextFloat();
                float volC = (float) 3.14 * (radiusC * radiusC) * (heightC / 3);
                System.out.println("Volume of the triangle is : " + volC);
            }
            case "prism" -> {
                System.out.println("Enter the base length of prism rectangle : ");
                float length = sc.nextFloat();
                System.out.println("Enter the base width of prism rectangle : ");
                float width = sc.nextFloat();
                float base = length * width;
                System.out.println("Enter the height of prism : ");
                float heightP = sc.nextFloat();
                float volP = base * heightP;
                System.out.println("Perimeter of the rectangle is : " + volP);
            }
            case "cylinder" -> {
                System.out.println("Enter the radius of cylinder : ");
                float rC = sc.nextFloat();
                System.out.println("Enter the height of cylinder : ");
                float hC = sc.nextFloat();
                float volCy = (float) (3.14 * (rC * rC) * hC);
                System.out.println("Perimeter of the parallelogram : " + volCy);
            }
            case "sphere" -> {
                System.out.println("Enter a radius of sphere : ");
                float rSph = sc.nextFloat();
                float volSph = (float) (4 / 3 * 3.14 * (rSph * rSph * rSph));
                System.out.println("Perimeter of rhombus is : " + volSph);
            }
            case "pyramid" -> {
                System.out.println("Enter the base length of pyramid : ");
                float bLen = sc.nextFloat();
                System.out.println("Enter the base width of pyramid : ");
                float bWid = sc.nextFloat();
                System.out.println("Enter the height of pyramid : ");
                float hPy = sc.nextFloat();
                float volPy = (bLen * bWid * hPy) / 3;
                System.out.println("Perimeter of square is : " + volPy);
            }
            default -> System.out.println("enter valid input");
        }
    }
}
