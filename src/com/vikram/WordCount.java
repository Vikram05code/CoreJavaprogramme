package com.vikram;

public class WordCount {
    public static void main(String[] args)
    {
        String str = "This     is a core java development course";
        System.out.println(str.length());

        int count = 0;
        boolean b=true;


        for(int i=0; i<str.length(); i++)
        {
            if(str.charAt(i) == ' ')
            {
                b=true;
            }
            else if(b==true)
            {
                b=false;
                count++;
            }
        }

        System.out.println(count);

    }
}
