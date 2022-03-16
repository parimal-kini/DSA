//        Input: num = [1,2,0,0], k = 34
//        Output: [1,2,3,4]
//        Explanation: 1200 + 34 = 1234
//
//        Input: num = [2,1,5], k = 806
//        Output: [1,0,2,1]
//        Explanation: 215 + 806 = 1021
package com.parimalkini;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class AddArrayFormInteger_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of array : ");
        for (int i=0; i< arr.length; i++)
            arr[i] = sc.nextInt();

        System.out.println("Enter the number you want to add to the array : ");
        int k = sc.nextInt();

        System.out.println(solution(arr, k));
    }

    static List<Integer> solution(int[] arr, int k){
        int n = arr.length;
        int i = n-1;
        List<Integer> sol = new ArrayList<>();

        while (i>=0 || k>0){
            if(i>=0){
                sol.add((arr[i]+k)%10);
                k = (arr[i]+k)/10;
            }else {
                sol.add(k%10);
                k /= 10;
            }
            i--;
        }
        Collections.reverse(sol);
        return sol;
    }
}
