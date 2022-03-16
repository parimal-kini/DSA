package com.parimalkini;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LuckyNumber_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int rows = sc.nextInt();
        System.out.println("Enter the number of cols : ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];
        System.out.println("Enter the elements of array : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++)
                matrix[i][j] = sc.nextInt();
        }
    }
}
