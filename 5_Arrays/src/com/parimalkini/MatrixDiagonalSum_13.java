//Input: mat = [[1,2,3],
//        [4,5,6],
//        [7,8,9]]
//        Output: 25
//        Explanation: Diagonals sum: 1 + 5 + 9 + 3 + 7 = 25
//        Notice that element mat[1][1] = 5 is counted only once.
package com.parimalkini;

import java.util.Scanner;

public class MatrixDiagonalSum_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter rows and cols of image : ");
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        int[][] mat = new int[rows][cols];

        System.out.println("Enter the elements of array : ");
        for (int i=0; i<rows; i++) {
            for (int j = 0; j < cols; j++) {
                mat[i][j] = scanner.nextInt();
            }
        }
        System.out.println(diagonalSum(mat));
    }
    public static int diagonalSum(int[][] mat){
        int n=mat.length;
        int sum=0;
        int i=0,j=0;

        while(i<n) {
            sum+=mat[i][j];
            i++;
            j++;
        }

        i=0;
        j=n-1;
        while(i<n){
            if(i!=j)
                sum+=mat[i][j];
            i++;
            j--;
        }
        return sum;
    }
}
