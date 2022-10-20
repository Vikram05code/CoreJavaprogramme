package com.vikram;

public class FibonaccUsingRecursion {
     static int n1=0;
     static int n2=1;
     static int n3=0;
    static void fibonacci(int n){
        if(n > 0){
            n3 = n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(", "+n3);
            fibonacci(n-1);
        }

    }

    public static void main(String[] args){
        int n = 10;
         System.out.print(n1+", "+n2);
         fibonacci(n-2);
    }
}