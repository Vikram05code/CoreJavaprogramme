package com.vikram;
import java.util.Map;
import java.util.HashMap;
public class LearnMap {

    public static void main(String[] args){

        Map<String, Integer> numbers = new HashMap<>();

        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);

        System.out.println(numbers);
    }
}
