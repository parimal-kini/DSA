//        [1,1,0,0,1] original array              [1 1 1 0 0]
//        [1,0,0,1,1] reverse of original         [0 0 1 1 1]
//        [0,1,1,0,0] inverse of reversed array   [1 1 0 0 0]

//        solving by two pointer approch
//        a ++      b--
//        [1,1,0,0,1]
//        we only want to invert them if they are similar,
//        and if single element left in middle invert it [1 1 0 0 0]
//            [0,1,1,0,0]
package com.parimalkini;

import java.util.Arrays;
import java.util.Scanner;

public class FlipImage_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter rows and cols of image : ");
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        int[][] image = new int[rows][cols];

        System.out.println("Enter the "+rows*rows+" co-ordinates for the image : ");
        for (int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                image[i][j] = scanner.nextInt();
            }
        }
        System.out.println(Arrays.toString(flipUImage(image)));
    }
    static int[][] flipUImage(int[][] image){
        for (int i=0; i<image.length; i++){
            int start = 0;
            int end = image[i].length-1;//length of row at 0th position
            while (start<=end){
                if(image[i][start] == image[i][end]){
                    image[i][start] = 1-image[i][start];
                    image[i][end] = image[i][start];
                }
                start++;
                end--;
            }
        }
        return image;
    }
}
