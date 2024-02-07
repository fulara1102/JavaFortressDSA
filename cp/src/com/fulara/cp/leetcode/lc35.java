/*
Given a sorted array of distinct integers and a target value, return the index if the target is found.
If not, return the index where it would be if it were inserted in order.
 */

package com.fulara.cp;

public class lc35 {
    public static void main(String[] args) {
        int[] a = {1,3,5,6};
        int target = 2;
        int result = searchInsert(a,target);
        System.out.println(result);
    }
    public static int searchInsert(int[] nums, int target) {
        int start = 0, end = nums.length;
        while (start < end) {
            int mid = (start + end) >>> 1;
            if (nums[mid] >= target) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}

