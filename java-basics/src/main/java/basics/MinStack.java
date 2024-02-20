package basics;

import java.util.ArrayList;
import java.util.Stack;

public class MinStack {

    int min = 99999;
    Stack<Integer> stack;

    void push(int val) {
        stack.push(val);
        if (stack.empty()|| val <min) {
            min = val;
        }
    }

    public void pop() {
        stack.pop();
    }




}
