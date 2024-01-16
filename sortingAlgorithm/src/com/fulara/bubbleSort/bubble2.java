
/* Sorting of given array */
package com.fulara.bubbleSort;

import java.util.Arrays;

public class bubble2 {
    public static void main(String[] args) {
        int[] n = {76, 4567, 98, 4, 78};
        bubble(n);
        System.out.println(Arrays.toString(n));
    }
    public static void bubble(int[] n){
        for (int i = 0;i<n.length;i++){
            int flag = 0;
            for (int j = 0;j<n.length -1 - i;j++){
                if (n[j] > n[j+1]){
                    int temp = n[j];
                    n[j] = n[j+1];
                    n[j+1] = temp;
                    flag = 1;
                }

            }
        if (flag == 0){
            break;
        }
        }
    }

}
