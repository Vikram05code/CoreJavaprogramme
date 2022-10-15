package com.vikram;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args){
        int[] arr = {10, 23, 12, 24, 25};
       // swap(arr, 1, 3);
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    static void reverse(int[] arr3){
        int start = 0;
        int end = arr3.length-1;
        while(start < end){
            // swap
            swap(arr3, start, end);
            start++;
            end--;
        }
    }


}
