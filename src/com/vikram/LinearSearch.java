package com.vikram;

public class LinearSearch {
    public static void main(String[] args){
       int[] nums = {22, 34, 55, 67, 87, 99, 12, 34, 5, 10 };
       int target =  87;
       int ans = linearSearch(nums, target );
       System.out.println(ans);
    }
    static int linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for(int index=0; index<arr.length; index++){
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        return -1;
    }
}
