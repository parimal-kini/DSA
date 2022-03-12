package com.parimalkini;

import java.util.Scanner;

public class TotalSurfaceAreaOfCube_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the side of cube : ");
        float side = scanner.nextFloat();

        float surfaceArea = 6 * (side*side);
        System.out.println("Total surface area of the cube is : "+surfaceArea);
    }
}
