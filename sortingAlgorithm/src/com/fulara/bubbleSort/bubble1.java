
/* Sorting of array input by user */

package com.fulara.bubbleSort;

import java.util.Arrays;
import java.util.Scanner;

public class bubble1 {
    public static void main(String[] args) {
        int[] a = {5, 4, 3, 2, 1};
        bubble(a);
        System.out.println(Arrays.toString(a));
        }
    public static void bubble(int[] a){
        for (int i = 0;i<a.length;i++){
            int flag = 0;
            for (int j = 0;j<a.length-1;j++){
                if(a[j]>a[j+1]){
                    int temp = a[j];
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
