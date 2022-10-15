// leetcode 1470. Shuffle the Array
/*Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].

        Return the array in the form [x1,y1,x2,y2,...,xn,yn].*/

package com.leetcode;
import java.util.Scanner;
import java.util.Arrays;
public class ShuffleArray {
    public static void main(String[] args){
     int[] nums = {2, 3, 5, 4, 1, 7};
     int n = 3;
     int[] arr = shuffle(nums, n);
     System.out.println(Arrays.toString(arr));

    }
 public static int[] shuffle(int[] nums, int n){
        int[] ans = new int[2*n];
        int j = 0;
        for(int i=0; i<2*n; i=i+2){
            ans[i] = nums[j];
            ans[i+1] = nums[j+n];
            j++;
        }
        return ans;
    }
}
