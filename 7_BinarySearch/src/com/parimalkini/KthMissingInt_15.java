package com.parimalkini;

public class KthMissingInt_15 {
    public static void main(String[] args) {
        int[] arr = {2,3,4,7,11};
        int k = 5;
        System.out.println(finfK(arr, k));
    }
    static int finfK(int[] arr, int k){
        int[] ans = new int[k+1];
        int i = 1;
        int start = 1;
        int end = arr[arr.length - 1];
        while (i < end){
            if(i != arr[i])
                ans[i-1] = i;
            else if(i == arr[i])

            i++;
        }
        return ans[k];
    }
}
