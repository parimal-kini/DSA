package com.parimalkini;

import java.util.Arrays;

public class GenerateSpiralMatrix_22 {
    public static void main(String[] args) {
        int n = 3;
//        generateSpiral(n);
        System.out.println(Arrays.deepToString(generateSpiral(n)));
    }
    static int[][] generateSpiral(int n){
        int[][] matrix = new int[n][n];
        int counter = 1;
        
        int rowBegin = 0;
        int rowEnd = n-1;
        int colBegin = 0;
        int colEnd = n-1;
        
        while (rowBegin<=rowEnd && colBegin<=colEnd){
            for (int i = colBegin; i <= colEnd ; i++) {
                matrix[rowBegin][i] = counter++;
            }
            rowBegin++;
            for (int i = rowBegin; i <= rowEnd ; i++) {
                matrix[i][colEnd] = counter++;
            }
            colEnd--;
            for (int i = colEnd; i >= colBegin ; i--) {
                matrix[rowEnd][i] = counter++;
            }
            rowEnd--;
            for (int i = rowEnd; i >= rowBegin ; i--) {
                matrix[i][colBegin] = counter++;
            }
            colBegin++;
        }
//        System.out.println(Arrays.deepToString(matrix));
        return matrix;
    }
}
