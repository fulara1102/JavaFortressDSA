package com.fulara.LinearSearch.in1D;

public class ls3 {
    public static void main(String[] args) {
        int[] a = {5,3,6,1,4,2};
        int target = 1;
        int index = linearSearch(a,target);
        System.out.println("The target is at " + index + " index");
    }
    // Search in the array : return index if item found
    //otherwise if item not found return  -1

    static int linearSearch(int[] a, int target){
        if (a.length == 0){
            return -1;
        }
        //run a loop
        for (int i = 0;i<a.length;i++)
            if (a[i] == target) {
                return i;
            }
        return -1;
    }
}

