package com.vikram;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpressionExample1 {
        public static void main(String[] args){

            List<String> list = new ArrayList<>();
            list.add("Vikram");
            list.add("mayank");
            list.add("ankit");

            list.forEach((n)-> System.out.println(n));
        }

    }
