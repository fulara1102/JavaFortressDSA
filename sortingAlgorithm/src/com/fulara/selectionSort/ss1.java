package com.fulara.selectionSort;

import java.util.Arrays;

public class ss1 {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,3,5,8};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void selection(int[] a){
        for(int i = 0;i<a.length;i++){
            int index = i;
            for(int j = i+1;j<a.length;j++){
                if (a[j] < a[index] ) {
                    index = j;
                }
            }
            int temp = a[index];
            a[index] = a[i];
            a[i] = temp;
        }
    }
}
