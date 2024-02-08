package com.fulara.cp.leetcode;

import java.util.Arrays;

public class lc2149 {
    public static void main(String[] args) {
        int[] a = {23,12,43,-12,-24};
        int[] ans = rearrangeArray(a);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] rearrangeArray(int[] nums) {
            int[] ans = new int[nums.length];
            int i = 0, j = 1;
            for (int num : nums) {
                if (num > 0) {
                    ans[i] = num;
                    i += 2;
                } else {
                    ans[j] = num;
                    j += 2;
                }
            }
            return ans;
        }
}
