package com.vikram;
import java.util.ArrayList;
import java.util.Iterator;
class Student1{
    int rollNo;
    String name;
    int age;

    Student1(int rollNo, String name, int age){
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
    }
}

public class LearnArrayList4 {
    public static void main(String[] args){
        Student1 s1 = new Student1(101, "Vikram", 20);
        Student1 s2 = new Student1(102, "Rahul", 18);
        Student1 s3 = new Student1(103, "Rohit", 16);

        ArrayList<Student1> al = new ArrayList<Student1>();
        al.add(s1); // adding student class Object
        al.add(s2);
        al.add(s3);

        //Getting Iterator
        Iterator itr = al.iterator();
        while(itr.hasNext()){
            Student1 st = (Student1)itr.next();
            System.out.println(st.rollNo+" "+st.name+" "+st.age);
        }

    }
}
