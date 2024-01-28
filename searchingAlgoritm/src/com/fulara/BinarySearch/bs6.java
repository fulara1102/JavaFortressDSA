package com.fulara.BinarySearch;

import java.util.Scanner;

public class bs6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for (int u = 0; u < arr.length;u++){
            arr[u] = in.nextInt();
        }
        int tar = in.nextInt();
        int res = solve(arr,tar);
        System.out.println(res);
    }
    public static int solve(int[] a, int target){
        int start = 0;
        int end = a.length -1;

        boolean isAsc = a[start] <= a[end];
        boolean isDes = a[start] >= a[end];
        while (start <= end){
            int mid = start + (end - start)/2;
            if (a[mid] == target){
                return mid;
            }
            if (isAsc){
                if (target > a[mid]){
                    start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
                if (isDes){
                    if (target < a[mid]){
                        start = mid + 1;
                    }
                    else {
                        end = mid - 1;
                    }
                }
                else {
                    return -1;
                }
            }
        }
        return -1;
    }
}
