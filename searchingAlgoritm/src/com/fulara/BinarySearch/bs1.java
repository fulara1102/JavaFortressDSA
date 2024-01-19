package com.fulara.BinarySearch;

public class bs1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int target = 1;
        int ans = binarysearch(arr,target);
        System.out.println("Target is at "+ans+" index poisition");
    }
    static int binarysearch(int[] a,int target){
        int start = 0;
        int end = a.length -1;
        while (start <= end){

        int mid = (start + end)/2;

        if (target > a[mid]){
            start = mid + 1;
        }

        else if (target < a[mid]) {
            end = mid - 1;
        }

        else {
            return mid;
        }

        }
        return -1;
    }

}
