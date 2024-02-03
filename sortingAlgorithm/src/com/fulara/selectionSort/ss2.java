package com.fulara.selectionSort;

import java.util.Arrays;

public class ss2 {
    public static void main(String[] args) {
        int[] arr = {2,5,1,7,5};
        ss2(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void ss2(int[] a ){
        for (int i = 0;i<a.length;i++){
            for (int j = i+1;j<a.length;j++){
                if (a[i]>a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
}
