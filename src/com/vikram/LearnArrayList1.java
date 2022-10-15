package com.vikram;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
public class LearnArrayList1 {
    public static void main(String[] args){
        List<String> ar1 = new ArrayList<>();
        ar1.add("Vikram");
        ar1.add("Rahul");
        ar1.add("Monu");
        ar1.add("Abhishek");
        ar1.add("Gaurav");

        Iterator itr = ar1.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
