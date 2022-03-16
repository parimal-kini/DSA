package com.parimalkini;

import java.util.Scanner;

public class MatrixByRotation_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int rows = sc.nextInt();
        System.out.println("Enter the number of cols : ");
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];
        System.out.println("Enter the elements of array : ");
        for (int i=0; i< rows; i++){
            for (int j=0; j<cols; j++)
                arr[i][j] = sc.nextInt();
        }

        int[][] targetArr = new int[rows][cols];
        System.out.println("Enter the elements of target array : ");
        for (int i=0; i< rows; i++){
            for (int j=0; j<cols; j++)
                targetArr[i][j] = sc.nextInt();
        }

        for (int i=0; i<4; i++){
            if(check(arr, targetArr)){
                System.out.println("True");
            }
            rotate(arr);
        }
        System.out.println("False");
    }

    static void rotate(int[][]mat){
        int n = mat.length;
        for (int i=0; i<n; i++){
            for (int j=0; j<i; j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        int start = 0;
        int end = n-1;
        while (start<=end){
            for (int row=0; row< mat.length; row++){
                int temp = mat[row][start];
                mat[row][start] = mat[row][end];
                mat[row][end] = temp;
            }
            start++;
            end--;
        }
    }
    static boolean check(int[][]mat, int[][]target){
        for (int i=0; i< mat.length; i++){
            for (int j=0; j< mat.length; j++){
                if(mat[i][j] != target[i][j])
                    return false;
            }
        }
        return true;
    }
}
