package com.fulara.BinarySearch;

public class floor {
    public static void main(String[] args) {
        int[] arr = {10,11,19,25,80,100};
        int target = 50;
        int res = floorSearch(arr, target);
        System.out.println(res);
    }
    public static int floorSearch(int[] a, int target){
        int start = 0;
        int end = a.length -1;

        while (start <= end){
            int mid = start + (end - start)/2;
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
        return end;
    }
}
