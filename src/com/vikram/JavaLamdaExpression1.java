package com.vikram;

interface Sayable{
    public String say(String name);
}

public class JavaLamdaExpression1 {
    public static void main(String[] args){
       // Lambda expression with single parameter
       Sayable s1=(name)->{
          return "hello "+ name;
       };
       System.out.println(s1.say("Vikram"));
    }
}



