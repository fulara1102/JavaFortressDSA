package com.fulara.LinearSearch.in2D;

import java.util.Arrays;

public class lsin2D {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4,5},
                {6,7,8,9},
                {10,11,12,13},
                {14,15,16,17,18}
        };
        int lakshya = 11;
        int[] sol = ls2D(arr,lakshya);
        System.out.println(Arrays.toString(sol));
    }
    static int[] ls2D(int[][] a,int target){
        for (int i = 0;i<a.length;i++){
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] == target) {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
