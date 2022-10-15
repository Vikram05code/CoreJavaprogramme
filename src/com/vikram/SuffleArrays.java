package com.vikram;

public class SuffleArrays {
    public static void main(String[] args){
        int[] nums = {2, 4, 5, 8, 3, 6, 9, 10};
        int n = nums.length/2;
        int[] ans = shuffle(nums, n) ;
        
    }
    static public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2*n];
        int j=0;
        for(int i=0; i<2*n; i=i+2){
            ans[i] = nums[j];
            ans[i+1] = nums[n+j];
            j++;
        }
        return ans;
    }
}
