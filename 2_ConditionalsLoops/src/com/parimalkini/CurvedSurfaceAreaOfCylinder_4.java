package com.parimalkini;

import java.util.Scanner;

public class CurvedSurfaceAreaOfCylinder_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius of the cylinder : ");
        float r = scanner.nextFloat();
        System.out.println("Enter the height of the cylinder : ");
        float h = scanner.nextFloat();

        float curvedSurfaceArea = (float) (2*3.14) *r* (r+h);
        System.out.println("Curved surface area of the given cylinder is : " + curvedSurfaceArea );
    }
}
