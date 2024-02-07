package com.fulara.bubbleSort;

import java.util.Arrays;
import java.util.Scanner;

public class b4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a = new int[5];
        System.out.println("Enter the array : ");
        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextInt();
        }
        bubbleSort(a);
        System.out.println(Arrays.toString(a));
    }

    public static void bubbleSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int flag = 0;
            for (int j = 0; j < a.length - 1 - i; j++) {
                flag = 0;
                if (a[j] > a[j + 1]) {
                    //swap
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    flag = 1;
                }
            }
            if (flag == 0) {
                break;
            }
        }
       // Arrays.sort(a);
    }
}
