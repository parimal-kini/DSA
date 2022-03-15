//        Input: accounts = [[1,2,3],[3,2,1]]
//        Output: 6
//        Explanation:
//        1st customer has wealth = 1 + 2 + 3 = 6
//        2nd customer has wealth = 3 + 2 + 1 = 6
//        Both customers are considered the richest with a wealth of 6 each, so return 6.

package com.parimalkini;

import java.util.Arrays;
import java.util.Scanner;

public class RichestCustomer_7 {
    public static void main(String[] args) {
//        Making scanner class object for input
        Scanner sc = new Scanner(System.in);

//        Taking number of rows input via 'sc' object for scanner class
        System.out.println("enter number of rows : ");
        int rows = sc.nextInt();

//        Taking number of col input via 'sc' object for scanner class
        System.out.println("enter number of cols : ");
        int cols = sc.nextInt();

//        Declaring and initializing 2D Array
        int[][] arr = new int[rows][cols];

//        Taking input of elements from user
        System.out.println("Enter "+rows*cols+" numbers : ");
        for(int x=0; x<rows; x++){
            for(int y=0; y<cols; y++){
                arr[x][y] = sc.nextInt();
            }
        }

//        Output of the above 2D Array
        for(int x=0; x<rows; x++){
            for(int y=0; y<cols; y++){
                System.out.print(arr[x][y]+" ");
            }
            System.out.println();
        }

        System.out.println(richestCustomer(arr));
    }

    static String richestCustomer(int arr[][]){
        int wealth = -1;
        int flag = 0;
        for(int i=0; i<arr.length; i++){
            int temp_sum = 0;
            for(int j=0; j<arr[i].length; j++){
                temp_sum += arr[i][j];
            }
            if(temp_sum > wealth){
                wealth = temp_sum;
                flag++;
            }
        }
        return ("Richest customer is : customer "+flag+"\nWith the wealth of : "+wealth);
    }
}
