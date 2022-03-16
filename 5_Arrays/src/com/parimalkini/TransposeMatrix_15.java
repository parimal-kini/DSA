//Input: matrix =[
// [1,2,3],
// [4,5,6],
// [7,8,9]
// ]

//Output: [
// [1,4,7],
// [2,5,8],
// [3,6,9]
// ]

package com.parimalkini;

import java.util.Arrays;
import java.util.Scanner;

public class TransposeMatrix_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int rows = sc.nextInt();
        System.out.println("Enter the number of cols : ");
        int cols = sc.nextInt();

        int[][] a = new int[rows][cols];
        System.out.println("Enter the elements of array : ");
        for (int i=0; i< rows; i++){
            for (int j=0; j<cols; j++)
                a[i][j] = sc.nextInt();
        }

        int[][] b = new int[cols][rows];

        transpose(a,b,rows,cols);

        System.out.println("Result matrix is \n");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++)
                System.out.print(b[i][j] + " ");
            System.out.print("\n");
        }
    }

    static int[][] transpose(int[][] arr,int[][] transpose, int rows, int cols){
        for (int i=0; i<cols; i++){
            for (int j=0; j<rows; j++)
                transpose[i][j] = arr[j][i];
        }
        return transpose;
    }
}
