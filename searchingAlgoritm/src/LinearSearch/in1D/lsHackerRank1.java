package LinearSearch.in1D;

import java.util.Scanner;

public class lsHackerRank1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of array : ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the element of array ");

        for (int i = 0;i<n;i++){
            arr[i] = in.nextInt();
        }
        System.out.println("Enter the target : ");
        int target = in.nextInt();
        int ans = ls(arr,target);
        System.out.println("The target is at "+ans+" index");
    }
    static int ls(int[] a, int target){
        for (int i = 0;i<a.length;i++){
            if (a[i] == target){
                return i;
            }
        }
        return -1;
    }
}
