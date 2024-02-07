
/*
You are given an array of characters letters that is sorted in non-decreasing order, and a character target. There are at least two different characters in letters.
Return the smallest character in letters that is lexicographically greater than target. If such a character does not exist, return the first character in letters.

Example 1:
Input: letters = ["c","f","j"], target = "a"
Output: "c"
Explanation: The smallest character that is lexicographically greater than 'a' in letters is 'c'.

Example 2:
Input: letters = ["c","f","j"], target = "c"
Output: "f"
Explanation: The smallest character that is lexicographically greater than 'c' in letters is 'f'.

Example 3:
Input: letters = ["x","x","y","y"], target = "z"
Output: "x"
Explanation: There are no characters in letters that is lexicographically greater than 'z' so we return letters[0].

*/
//import java.util.Arrays;
package com.fulara.leetCode;

public class leetcode744 {
    public static void main(String[] args) {
//        char[] ch = {'c','f','j'};
//        char target = 'c';

//        char[] ch = {'c','f','j'};
//        char target = 'a';

        char[] ch = {'x','x','y','y'};
        char target = 'z';
        char result = lc(ch, target);
        System.out.println(result);
    }

    public static char lc(char[] a, char target){
        int start = 0;
        int end = a.length - 1;

        while (start <= end){
            int mid = start +(end - start)/2;
            if (a[mid] <= target){
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return a[start % a.length];
    }

}