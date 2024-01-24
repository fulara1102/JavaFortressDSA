package com.fulara.BinarySearch;

public class bs3 {
    public static void main(String[] args) {
        int[] a = {12,23,34,56,67,78,89};
        int target = 56;
        int res = bin(a,target);
        System.out.println(res);
    }

    public static int bin(int[] a, int target){
        int start = 0;
        int end = a.length - 1;

        while (start <= end){
            int mid = start +(end - start)/2;
            if (target > a[mid]){
                mid = start + 1;
            }
            else if (target < a[mid]) {
                mid = end - 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }



}
