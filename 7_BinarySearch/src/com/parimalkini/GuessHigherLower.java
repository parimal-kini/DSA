package com.parimalkini;

public class GuessHigherLower {
    public static void main(String[] args) {
        int n = 10;
        int target = 6;
        System.out.println(binarySearch(n, target));
    }
    static int binarySearch(int n, int target){
        int start = 1;
        int end = n;
//        int mid = start + (end - start)/2; doesn't work when mid is initialized outside while loop

        while (start <= end){
            int mid = start + (end - start)/2;

            if(target < mid)
                end = mid - 1;
            else if(target > mid)
                start = mid + 1;
            else
                return mid;
        }
        return -1;
    }
}
