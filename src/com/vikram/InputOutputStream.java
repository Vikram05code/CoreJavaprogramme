package com.vikram;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class InputOutputStream {
    public static void main(String[] args){
        //code to create a new file
        /*
        File myFile = new File("vikram.txt");
        try{
            myFile.createNewFile();
        }catch(IOException e){
            System.out.println("Unable to create this file");
            e.printStackTrace();
        }
         */
        // code to write to a file
        /*
        try{
            FileWriter myFileWriter = new FileWriter("vikram.txt");
            myFileWriter.write("This is my first file from this java course\nOkay now bye");
            myFileWriter.close();
        }catch(IOException e){
            e.printStackTrace();
        }
         */
        // Reading a file
        /*
        File readFile = new File("vikram.txt");
        try{
            Scanner sc = new Scanner(readFile);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
          */

        // deleting a file
        File dFile = new File("vikram.txt");
        if(dFile.delete()){
            System.out.println("I have deleted: "+dFile.getName());
        }else{
            System.out.println("Some error occured while deleting the file");
        }

    }
}
