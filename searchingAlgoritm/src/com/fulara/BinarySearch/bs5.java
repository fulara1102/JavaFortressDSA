package com.fulara.BinarySearch;

import java.util.Scanner;

class bs5 {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int n = in.nextInt();
       int[] arr = new int[n];
       System.out.println("Enter the element of array : " );
       for(int i = 0; i<n;i++){
        arr[i] = in.nextInt();
       } 
       System.out.println("Enter the target : ");
       int target = in.nextInt();
       System.out.println(search(arr, target));

    }   
    public static int search(int[] a, int target){
        int start = 0;
        int end = a.length - 1;
        
        while (start <= end) {
            int mid = start + (end - start)/2;

            if (a[mid] == target) {
                return mid;
            }
            if (target > a[mid]) {
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        
        return -1;
    } 
}