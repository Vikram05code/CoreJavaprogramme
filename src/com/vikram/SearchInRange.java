package com.vikram;

public class SearchInRange {
    public static void main(String[] args){
        int[] arr = {12, 32, 14, 67, 25, 98, 36, 21};
        int target = 25;
        int ans = search(arr, target, 2, 6);
        System.out.println(ans);
    }
    static int search(int[] arr, int target, int start, int end){
        if(arr.length == 0){
            return -1;
        }
        for(int i=start; i<=end; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
