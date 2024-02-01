package com.fulara.BinarySearch;

public class ceiling {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 15;
        int res = ceilingSearch(arr, target);
        System.out.println(res);
    }

    public static int ceilingSearch(int[] a, int target) {
        int start = 0;
        int end = a.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == a[mid]){
                return mid;
            }
            if (target < a[mid]){
                end = mid - 1;
            }
            if (target > a[mid]){
                start = mid + 1;
            }
        }
        return start;
    }
}