package com.fulara.BinarySearch;

public class ceiling1 {
    public static void main(String[] args) {
        int[] arr = {
            23,34,45,56,66,67,78,89,111
        };
        int target = 69;
        int result = ceiling1(arr, target);
        System.out.println(result);
    }   
    public static int ceiling1(int[] a, int target){
        int start = 0;
        int end = a.length - 1;

        while (start <= end) {
            int mid = start + (end - start)/2;

            if (a[mid] == target) {
                return target;
            }
            if (a[mid] >= target) {
                end = mid - 1;
            }
            if (a[mid] <= target) {
                start = mid + 1;
            }
        }
        return a[start];

    } 
}
