package com.vikram;



public class EvenDigits2 {
    public static void main(String[] args){
       int[] nums = {657, 2, 1234, 76, 5, 1879};
       System.out.println(findNumbers(nums));
    }
    static int findNumbers(int[] nums){
        int count = 0;
        for(int num : nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    static boolean even(int num){
        int numberOfDigits = digits(num);
        if(numberOfDigits % 2 == 0){
            return true;
        }
        return false;
    }
    static int digits(int num){
        int digitsCount = 0;
        while(num > 0){
            digitsCount++;
            num = num/10;
        }
        return digitsCount;
    }
}
