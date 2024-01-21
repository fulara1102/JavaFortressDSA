package com.fulara.LinearSearch.in1D;

public class ls5 {
    public static void main(String[] args) {
        int[] arr = {23,4,353,34,534,346,5,35,54,2,3543,6,45,5,46,5,2,4,34};
        int target = 45;
        int result = linearSearch(arr,target);
        System.out.println("The element is at "+result+" index position");

    }
    static int linearSearch(int[] a, int target){
        for (int i = 0;i<a.length;i++){
            if (a[i] == target){
                return i;
            }
        }
        return -1;
    }
}
