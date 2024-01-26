package com.fulara.BinarySearch;

import java.util.Scanner;

public class bs4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter the array : ");
        for (int i = 0; i< arr.length;i++){
            arr[i] = in.nextInt();
        }
        System.out.println("Enter the target : ");
        int tar = in.nextInt();
        int result = binarySearch(arr,tar);
        System.out.println("The targer is at "+result+" index position");

    }
    public static int binarySearch(int[] a, int target){
        int start = 0;
        int end = a.length - 1;
        boolean isAsc = a[start] <= a[end];
        while (start <= end){
            int mid = (start + end)/2;
//            if (a[mid] == target){
//                return mid;
//            }
            if (isAsc){
                if (a[mid] > target){
                    end = mid - 1;
                }
                if (a[mid] < target){
                    start = mid + 1;
                }
                else {
                    return mid;
                }
            }
            else {
                if (a[mid] < target){
                    end = mid - 1;
                }
                if (a[mid] > target){
                    start = mid + 1;
                }
                else {
                    return mid;
                }
            }
        }
        return -1;
    }
}