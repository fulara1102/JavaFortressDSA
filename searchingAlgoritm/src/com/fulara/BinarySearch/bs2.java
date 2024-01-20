package com.fulara.BinarySearch;

public class bs2 {
    public static void main(String[] args) {

        int[] arr = {12,23,34,56,76,89,98};
        int target = 89;

        int[] arrr = {89,76,65,54,43,32,21,1};
        int flag = 54;

        int result = binarySearch(arr,target);
        int result1= binarySearch(arrr,flag);
        System.out.println("The target is at "+result+" index position");
        System.out.println("-------------------------------------------------");
        System.out.println("The target is at "+result1+" index position");

    }
    static int binarySearch(int[] a,int target){
        int start = 0;
        int end = a.length -1;

        boolean isAsc = a[start] < a[end];

        while (start <= end){
            int mid = start + (end - start) / 2;

            if (target == a[mid]){
                return mid;
            }

            if (isAsc) {
                if (target > a[mid]) {
                    start = mid + 1;
                }
                else if (target < a[mid]) {
                    end = mid - 1;
                }
            }
            else {
                if (target > a[mid]){
                    end = mid - 1;
                }
                else if (target < a[mid]) {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
