package com.vikram;

public class FindMinimum {
    public static void main(String[] args){
        int[] arr = {5, 8, 1, 9, 23, -2, 18, 0, 46, -4};
        System.out.println(min(arr));
    }
    static int min(int[] arr){
        int ans = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] < ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
