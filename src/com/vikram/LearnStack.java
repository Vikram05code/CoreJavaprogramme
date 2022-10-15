package com.vikram;
import java.util.Stack;

public class LearnStack {
    public static void main(String[] args){
        Stack<String> animal = new Stack<>();

        animal.push("Lion");
        animal.push("Dog");
        animal.push("Elephant");
        animal.push("Tiger");
        System.out.println(animal);

        System.out.println(animal.peek());

        animal.pop();
        System.out.println(animal.peek());
        System.out.println(animal);
    }
}
