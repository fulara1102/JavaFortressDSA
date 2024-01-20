package com.fulara.LinearSearch.in1D;

public class ls4 {
    public static void main(String[] args) {
//        int[] arr  = {12,2,3,54,67,};
        int[] arr = {};
        int target = 3;
        System.out.println(ls(arr,target));
    }
    static int ls(int[] a,int target){
        if (a.length == 0){
            System.out.println("0 item in array");;
        }
        for (int i=0;i<a.length;i++){

            if (a[i] == target){
                return i;
            }
        }
        return -1;
    }
}
