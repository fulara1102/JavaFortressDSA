package com.fulara.BinarySearch;

import java.util.Scanner;

public class bs4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[3];
        System.out.println("Enter the array : ");
        for (int i = 0; i< arr.length;i++){
            arr[i] = in.nextInt();
        }
        System.out.println("Enter the target : ");
        int tar = in.nextInt();
        int result = binarySearch(arr,tar);
//        System.out.println("The target is at "+result+" index position");

        System.out.println(result);
    }
    public static int  binarySearch(int[] a, int target) {
        int start = 0;
        int end = a.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (a[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return a[start % a.length];
    }
}