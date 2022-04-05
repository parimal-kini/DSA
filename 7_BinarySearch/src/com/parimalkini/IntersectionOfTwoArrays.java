package com.parimalkini;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};

        System.out.println(Arrays.toString(findIntersection(nums1, nums2)));
    }
    static int[] findIntersection(int[] nums1, int[] nums2){
//        List<Integer> list = new ArrayList<>();
        HashSet<Integer> set=new HashSet<Integer>();

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if(nums1[i] == nums2[j]){
//                    list.add(nums1[i]);
                    set.add(nums1[i]);
                    break;
                }
            }
        }

        int j = 0;
        int[] arr = new int[set.size()];
        for (int i: set)
            arr[j++] = i;

        return arr;
    }
}
