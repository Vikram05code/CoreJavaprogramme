package com.vikram;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args){
        int[][] arr = {
                {1, 3, 5},
                {4, 6, 7, 20},
                {8, 9, 18, 36},
                {87, 90, 48, 50}
        };
        int target = 18;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
        System.out.println(max(arr));
    }
    static int[] search(int[][] arr, int target){
        for(int row=0; row<arr.length; row++){
            for(int col=0; col<arr[row].length; col++){
                if(target == arr[row][col]){
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }

    static int max(int[][] arr){
        int max = Integer.MIN_VALUE;
        for(int row=0; row <arr.length; row++){
            for(int col=0; col<arr[row].length; col++ ){
                if(arr[row][col] > max){
                    max = arr[row][col];
                }
            }
        }
        return max;
    }
}
