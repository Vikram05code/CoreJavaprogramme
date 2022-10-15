package com.vikram;

public class Max {
    public static void main(String[] args) {
        int[] arr = {23, 12, 24, 35, 3};
        System.out.println(max(arr));
        System.out.println(maxRange(arr, 1, 2));
    }

    static int max(int[] arr1){
        if(arr1.length == 0){
            return -1;
        }
        int maxValue = arr1[0];
        for(int i=1; i<arr1.length; i++){
            if(arr1[i] > maxValue ){
                maxValue = arr1[i];
            }
        }
        return maxValue;
    }

    static int maxRange(int[] arr2, int start, int end){
        if(end < start){
            return -1;
        }
        if(arr2 == null){
            return -1;
        }
        int maxValue1 = start;
        for(int i = start; i<=end; i++){
            if(arr2[i] > maxValue1){
                maxValue1 = arr2[i];
            }
        }
        return maxValue1;
    }


}
