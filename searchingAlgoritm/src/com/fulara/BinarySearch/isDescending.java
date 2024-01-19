/* Now we will sort the array which is in descending order */

package com.fulara.BinarySearch;

public class isDescending {
    public static void main(String[] args) {
        int[] a = {98,76,65,43,23,21,11,2};
        int target = 11;
        int result = descendingOrder(a,target);
        System.out.println("The element is at "+result+" index position");
    }
    static int descendingOrder(int[] a, int target){
        int start = 0;
        int end = a.length -1;
        while (start <=end){

            int mid = (start + end)/2;  //  Integer limit can exceed

            if (target < a[mid]){
                start = mid + 1 ;
            }
            else if (target > a[mid]){
                end = mid - 1;
            }
            else{
                return mid;
            }

        }
        return -1;
    }
}
