package com.parimalkini;

public class GuessHigherLower_10 {
    public static void main(String[] args) {
        int n = 10;
        int target = 4;
        System.out.println(guessNumber(n, target));
    }

    static int guessNumber(int n, int target) {
        int start = 1;
        int end = n;
        while(start <= end){
            int mid = start + (end - start) / 2;
            int ans = guess(mid, target);
            if(ans == 0)
                return mid;
            else if(ans < 0)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return -1;
    }

    static int guess(int mid, int target){
        if(mid == target)
            return 0;
        else if(mid < target)
            return 1;
        return -1;
    }
}

//    static int binarySearch(int n, int target){
//        int start = 1;
//        int end = n;
////        int mid = start + (end - start)/2; doesn't work when mid is initialized outside while loop
//
//        while (start <= end){
//            int mid = start + (end - start)/2;
//
//            if(target < mid)
//                end = mid - 1;
//            else if(target > mid)
//                start = mid + 1;
//            else
//                return mid;
//        }
//        return -1;
//    }
