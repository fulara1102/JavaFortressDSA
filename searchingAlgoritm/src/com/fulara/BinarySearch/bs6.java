package com.fulara.BinarySearch;

import java.util.Scanner;

public class bs6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of Array : ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the element of array : ");
        for (int i = 0; i < arr.length;i++){
            arr[i] = in.nextInt();
        }
        System.out.println("Enter the target : ");
        int tar = in.nextInt();
        int res = solve(arr,tar);
        System.out.println("The element is at "+res+" index position");
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
                int flag = 0;
                if (target > a[mid]){
                    start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
                flag = 1;
            }
            if (isDes){
                int flag1 = 0;
                if (target < a[mid]){
                        start = mid + 1;
                    }
                    else {
                        end = mid - 1;
                    }
                    flag1 = 1;
                }
//            else {
//                    return -1;
//                }
            }
        return -1;
        }
    }
