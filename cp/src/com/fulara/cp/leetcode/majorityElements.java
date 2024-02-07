package com.fulara.cp.leetcode;

import java.util.Arrays;

public class majorityElements {
    public static void main(String[] args) {
        int[] a = {2,3,2};
        int res = majorityElement(a);
        System.out.println("Majority elements are "+res);
    }
    public static int majorityElement(int[] nums) {
            //Arrays.sort(nums)
        for (int i = 0;i<nums.length;i++){
            int flag = 0;
            for (int j = 0;j<nums.length -1 -i;j++){
                if (nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    flag = 1;
                }
            }
            if (flag == 0){
                break;
            }
        }
        return nums[nums.length / 2];
    }
}

