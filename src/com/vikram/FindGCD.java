package com.vikram;

public class FindGCD {
    public static void main(String[] args){
        int a = 100;
        int b = 15;
        int temp = 0;
        while(a%b != 0){
            temp = b;
            b = a%b;
            a = temp;

        }
        System.out.println(b);
    }
}
