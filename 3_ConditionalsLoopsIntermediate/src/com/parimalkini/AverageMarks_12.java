package com.parimalkini;

import java.util.Scanner;

public class AverageMarks_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mathematics : ");
        float maths = sc.nextFloat();
        System.out.print("Biology : ");
        float bio = sc.nextFloat();
        System.out.print("Physics : ");
        float phy = sc.nextFloat();
        System.out.print("Chemistry : ");
        float chem = sc.nextFloat();
        System.out.print("Algebra : ");
        float alg = sc.nextFloat();
        System.out.print("Geometry : ");
        float geo = sc.nextFloat();

        float marks = maths+bio+phy+chem+alg+geo;
        int total = 600;
        float avg = marks/total*100;

        System.out.println("Average marks : "+avg);
    }
}
