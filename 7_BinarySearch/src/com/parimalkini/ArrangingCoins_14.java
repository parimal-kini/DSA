package com.parimalkini;

public class ArrangingCoins_14 {
    public static void main(String[] args) {
//        int n = 10;
        int n = 1804289383;
        System.out.println(arrangeCoins(n));
    }
    static int arrangeCoins(int n) {
        long x = (long)n;
        return (int) (-0.5 + Math.sqrt(2 * x + 0.25));
    }
}
//----------------------brute force method---------------------//
//    int temp = 0, i = 1;
//        while(n >= 0){
//                temp++;
//                n = n - i;
//                i++;
//                }
//                return temp - 1;

//-------------------------binary search-------------------------//
//int start = 1;
//    int end = n;
//        while(start <= end){
//                long mid = start + (end - start) / 2;
//                long currentSum = mid*(mid + 1) / 2;
//
//                if(currentSum == n)
//                return (int)mid;
//
//                if(currentSum > n)
//                end = (int) mid - 1;
//                else
//                start = (int) mid + 1;
//                }
//                return end;