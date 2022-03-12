package com.parimalkini;

import java.util.Scanner;

public class Area_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a shape : ");
        String input = sc.next();

        switch (input) {
            case "circle" -> {
                System.out.println("Enter the radius of circle : ");
                float radius = sc.nextFloat();
                float areaC = (float) (3.14 * (radius * radius));
                System.out.println("Area of the circle is : " + areaC);
            }
            case "triangle" -> {
                System.out.println("Enter the base of the triangle : ");
                float base = sc.nextFloat();
                System.out.println("Enter the height of the triangle from base : ");
                float height = sc.nextFloat();
                float areaT = (float) (0.5 * base * height);
                System.out.println("Area of the triangle is : " + areaT);
            }
            case "rectangle" -> {
                System.out.println("Enter the length of the rectangle : ");
                float length = sc.nextFloat();
                System.out.println("Enter the breadth of the rectangle : ");
                float breadth = sc.nextFloat();
                float areaR = length * breadth;
                System.out.println("Area of the rectangle is : " + areaR);
            }
            case "isoceles" -> {
                System.out.println("Enter the base of the triangle : ");
                float baseI = sc.nextFloat();
                System.out.println("Enter the height of the triangle from base : ");
                float heightI = sc.nextFloat();
                float areaI = (baseI * heightI) / 2;
                System.out.println("Area of the isoceles triangle is : " + areaI);
            }
            case "parallelogram" -> {
                System.out.println("Enter the base of the parallelogram : ");
                float baseP = sc.nextFloat();
                System.out.println("Enter the height of parallelogram : ");
                float heightP = sc.nextFloat();
                float areaP = baseP * heightP;
                System.out.println("Area of the parallelogram : " + areaP);
            }
            case "rhombus" -> {
                System.out.println("Enter first diagonal : ");
                float p = sc.nextFloat();
                System.out.println("Enter second diagonal : ");
                float q = sc.nextFloat();
                float areaRh = p * q;
                System.out.println("Area of rhombus is : " + areaRh);
            }
            case "equilateral" -> {
                System.out.println("Enter the side of equilateral triangle : ");
                float a = sc.nextFloat();
                float aSquare = a * a;
                float areaE = (float) (0.433 * aSquare);
                System.out.println("Area of equilateral triangle is : ");
            }
            default -> System.out.println("enter valid input");
        }
    }
}
