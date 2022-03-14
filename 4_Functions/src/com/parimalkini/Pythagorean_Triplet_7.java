package com.parimalkini;

import java.util.Scanner;

public class Pythagorean_Triplet_7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter largest side : ");
        int a = in.nextInt();
        System.out.println("Enter a side : ");
        int b = in.nextInt();
        System.out.println("Enter a side : ");
        int c = in.nextInt();

        pythagoreanTriplet(a, b, c);
    }

    static void pythagoreanTriplet(int a, int b, int c){
        if(a*a == (b*b) + (c*c))
            System.out.println("Is a pythagorean triplet");
        else
            System.out.println("not pythagorean triplet");
    }
}
