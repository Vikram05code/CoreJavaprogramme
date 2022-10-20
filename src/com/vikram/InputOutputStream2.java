package com.vikram;
import java.io.FileOutputStream;
import java.io.IOException;
public class InputOutputStream2 {
    public static void main(String[] args){

        // Java FileOutputStream Example1: write byte
        /*
        try{
            FileOutputStream fout = new FileOutputStream("D:\\vikram.txt");
            fout.write(65);
            fout.close();
            System.out.println("Sucess");
        }catch(IOException e){
            System.out.println(e);
        } */

        // Java FileOutputStream Example2: write String
        try{
            FileOutputStream fout1 = new FileOutputStream("vikram.txt");
            String s = "Hello everyone, how are you doing";
            byte[] b = s.getBytes(); //converting string byte array
            fout1.write(b);
            fout1.close();
            System.out.println("Success");
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
