package com.vikram;
import java.util.Stack;
import java.util.Iterator;
public class LearnStack1 {
    public static void main(String[] args){

        Stack<Integer> st = new Stack<>();
        st.push(60);
        st.push(70);
        st.push(20);
        st.push(12);
        st.push(8);

        st.pop();

        Iterator<Integer> itr = st.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
