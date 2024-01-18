package com.fulara.bubbleSort;

//import java.lang.reflect.Array;
import java.util.Arrays;

public class bubble3 {
    public static void main(String[] args) {

        int[] a = {76, 43, 34, 32, 721, 67, 2};
        bubble(a);
        System.out.println(Arrays.toString(a));
    }
    public static void bubble(int[] a){
        for (int i = 0;i<a.length;i++){
            int flag = 0;
            int temp;
            for (int j = 0;j<a.length - 1 -i;j++){
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
