package com.parimalkini;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix1_21 {
    public static void main(String[] args) {
        int matrix[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };
        System.out.println(spiralOrder(matrix));
    }
    static List<Integer> spiralOrder(int[][] matrix){
        List<Integer> ans = new ArrayList<>();
        if(matrix.length == 0) return ans;

        int rowBegin = 0;
        int rowEnd = matrix.length - 1;
        int colBegin = 0;
        int colEnd = matrix[0].length - 1;

        while (rowBegin <= rowEnd && colBegin <= colEnd){

            for (int i = colBegin; i <= colEnd ; i++) {
                ans.add(matrix[rowBegin][i]);
            }
            rowBegin++;

            for (int i = rowBegin; i <= rowEnd ; i++) {
                ans.add(matrix[i][colEnd]);
            }
            colEnd--;

            for (int i = colEnd; i >= colBegin ; i--) {
                ans.add(matrix[rowEnd][i]);
            }
            rowEnd--;
            for (int i = rowEnd; i >= rowBegin ; i--) {
                ans.add(matrix[i][colBegin]);
            }
            colBegin++;
        }
        return ans;
    }
}
