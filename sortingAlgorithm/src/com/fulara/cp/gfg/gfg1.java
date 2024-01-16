///* Given an Integer N and a list arr. Sort the array using bubble sort algorithm.
//
//Example 1:
//Input:
//N = 5
//arr[] = {4, 1, 3, 9, 7}
//Output:
//1 3 4 7 9
//
//Example 2:
//Input:
//N = 10
//arr[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1}
//Output:
//1 2 3 4 5 6 7 8 9 10
//
//Your Task:
//You don't have to read input or print anything.
//Your task is to complete the function bubblesort() which takes the array
//and it's size as input and sorts the array using bubble sort algorithm. */
//


package com.fulara.cp.gfg;

import com.sun.source.tree.BreakTree;

import java.util.Arrays;
import java.util.Scanner;

public class gfg1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("enter the number ");
        int n = in.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the arrays element : ");
        for (int i = 0;i<n;i++){
            arr[i] = in.nextInt();
        }
        bubblesort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static int bubblesort(int[] arr){
        int n = arr.length;
        for (int i = 0; i< arr.length;i++ ){
            int temp;
            int target = 0;
            for (int j = 0;j<arr.length - 1 -i;j++){
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    target = 1;

                }
            }
            if (target == 0){
                break;
            }
        }
        return n;
    }
}

