package com.vikram;

public class OrderAgnosticBS {
    public static void main(String[] args){
      int[] arr = {60, 55, 40, 38, 35, 30, 28, 25, 19, 17, 15, 10, 8, 5, 1};
      int target = 8;
      int ans = orderAgnosticBS(arr, target);
      System.out.println(ans);
    }
    static int orderAgnosticBS(int[] arr, int target){
        int start =0;
        int end = arr.length-1;
        //find wheather array is ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while(start <= end){
            int mid = start + (end - start)/2;
            if(target == arr[mid]){
                return mid;
            }else if(isAsc){
                if(target > arr[mid]){
                    start = mid+1;
                }else{
                    end = mid-1;
                }
            }else{
                if(target > arr[mid]){
                    end = mid -1;
                }else{
                    start = mid+1;
                }
            }
        }
        return -1;
    }
}
