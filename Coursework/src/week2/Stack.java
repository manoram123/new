package week2;

public class Stack {
    int size = 10;
    String []stack = new String[size];
    int top =0;
    int c =0;
    public void push(String data){
        stack[top] = data;
        top++;
    }

    public String pop(){
        String data;
        top--;
        data = stack[top];
        stack[top] = null;
        return data;
    }

    public String peek(){
        String data = "";
        if(top>0) {
            data = stack[top - 1];
        }
        else{
            data = "";
        }
        return data;
    }

    public boolean isEmpty(){
        boolean isEmp = false;
        if(stack[0] == null){
            isEmp = true;
        }
        return isEmp;
    }

    public String get(int index){
        String data = stack[index];
        return data;
    }

    public void printStack(){
        for(int i=0; i<size; i++){
            System.out.print(stack[i]+ " ");
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push("a");
        s.push("b");
        s.push("c");
        s.pop();
        s.pop();
        s.pop();
        System.out.println(s.peek());
        s.printStack();
    }

}
