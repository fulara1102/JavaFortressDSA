package com.fulara.LinearSearch.in1D;

import java.util.Scanner;

public class ls6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter the elements of Array : ");
        for (int i = 0;i<arr.length;i++){
            arr[i] = in.nextInt();
        }
        System.out.println("Enter the target element : ");
        int target = in.nextInt();
        int res = linearr(arr, target);
        System.out.println("The target element is at "+res+" index position");
    }
    public static int linearr(int[] a, int target){
        for (int i = 0;i<a.length;i++){
            if (a[i] == target){
                return i;
            }
        }
        return -1;
    }
}
