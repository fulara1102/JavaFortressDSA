package com.fulara.orderAgnostic;

public class orderAgno1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int target = 5;
        int result = orderAgnostic(arr,target);
        System.out.println("The element is at "+result+" index position");

    }
    static int orderAgnostic(int[] a, int target){
        int start = 0;
        int end = a.length -1;

        boolean isAsc = a[start] < a[end];

        while (start <= end){
            int mid = (start + end)/2;

            if(target == a[mid]){
                return mid;
            }

            if (isAsc){
                if (target > a[mid]){
                    start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
            }
            else {
                if (target < a[mid]){
                    start = mid + 1;
                }
                else {
                    end = mid -1;
                }
            }
        }
        return -1;
    }
}
