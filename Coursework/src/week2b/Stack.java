package week2b;

import java.util.ArrayList;
import java.util.List;

public class Stack {

    List<Integer> arr = new ArrayList<>();
    int top =0;

    public void push(int data){
       arr.add(data);
       top++;
    }

    public int pop(){
        top--;
        int data = arr.get(top);
        arr.set(top, 0);
        return data;
    }

    public int peek(){
        if(top>=1){
            return arr.get(top - 1);
        }
        return 0;
    }

    public int size(){
        return arr.size();
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.peek());
        System.out.println(s.size());
    }
}
