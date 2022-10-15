package com.vikram;
import java.util.Arrays;
import java.util.Scanner;
public class Input {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         /*int[] arr = new int[5];
         arr[0] = 5;
         arr[1] = 6;
         arr[2] = 7;
         arr[3] = 10;
         arr[4] = 12;

         System.out.print(Arrays.toString(arr));

         System.out.println(arr[4]);

         //input using for loops
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
*/


        //print arr using for loop
        /*for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }*/

        //use inhanced for loop
        /*for(int num : arr){
            System.out.print(num+" ");
        }*/

        //array of objects
        String[] str = new String[5];
        for(int i=0; i<str.length; i++){
            str[i] = sc.next();
        }

        System.out.print(Arrays.toString(str));
        str[1] = "Vikram";
        System.out.print(Arrays.toString(str));
    }
}
