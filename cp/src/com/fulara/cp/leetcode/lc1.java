
/* Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color
are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.



Example 1:
Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]

Example 2:
Input: nums = [2,0,1]
Output: [0,1,2] */

package com.fulara.cp.leetcode;

import java.util.Arrays;
import java.util.Scanner;
public class lc1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0;i<n;i++){
            a[i] = in.nextInt();
        }
        leetbubble(a);
        System.out.println(Arrays.toString(a));
    }
    public static void leetbubble(int[] a){
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int temp;
            int flag = 0;
            for (int j = 0;j<a.length-1-i;j++){
                if(a[j] > a[j+1]){
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    flag = 1;
                }
            }
            if (flag == 0){
                break;
            }

        }
    }
}
