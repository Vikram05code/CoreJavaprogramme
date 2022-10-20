package com.vikram;

interface Sayable1{
    String say(String message);
}
public class LambdaExpressionExample2 {
    public static void main(String[] args){

        //You can pass multiple statements in lambda expression
        Sayable1 sc = (message)->{
            String s1 = "I would like to say, ";
            String s2 =  s1+ message;
            return s2;
        };
        System.out.println(sc.say("time is precious."));
    }
}
