package com.parimalkini;

import java.util.Scanner;

public class Perimeter_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a shape : ");
        String input = sc.next();

        switch (input) {
            case "circle" -> {
                System.out.println("Enter the radius of circle : ");
                float radius = sc.nextFloat();
                float periC = (float) (2 * 3.14 * radius);
                System.out.println("Perimeter of the circle is : " + periC);
            }
            case "equi-triangle" -> {
                System.out.println("Enter a side of the equilateral triangle : ");
                float side = sc.nextFloat();
                float periT = (float) (3 * side);
                System.out.println("Perimeter of the triangle is : " + periT);
            }
            case "rectangle" -> {
                System.out.println("Enter the length of the rectangle : ");
                float length = sc.nextFloat();
                System.out.println("Enter the width of the rectangle : ");
                float width = sc.nextFloat();
                float periR = 2 * (length + width);
                System.out.println("Perimeter of the rectangle is : " + periR);
            }
            case "parallelogram" -> {
                System.out.println("Enter the base of the parallelogram : ");
                float baseP = sc.nextFloat();
                System.out.println("Enter the side of parallelogram : ");
                float sideP = sc.nextFloat();
                float periP = 2 * (sideP + baseP);
                System.out.println("Perimeter of the parallelogram : " + periP);
            }
            case "rhombus" -> {
                System.out.println("Enter a side of rhombus : ");
                float s = sc.nextFloat();
                float periRh = 4 * s;
                System.out.println("Perimeter of rhombus is : " + periRh);
            }
            case "square" -> {
                System.out.println("Enter a side of square : ");
                float a = sc.nextFloat();
                float periS = 4 * a;
                System.out.println("Perimeter of square is : " + periS);
            }
            default -> System.out.println("enter valid input");
        }
    }
}
