package week2a;

public class BalancePair {
    Stack s = new Stack();

    String exp = "";

    public void bal(String exp){

        if(exp.charAt(0) == ')' || exp.charAt(0) == '}' || exp.charAt(0) == ']'){
            System.out.println("The Given Expression is not Balanced.");
        }
        else {
            for (int i = 0; i <exp.length(); i++) {
                char ch = exp.charAt(i);
                if (ch == '[' || ch == '{' || ch == '(') {
                    s.push(String.valueOf(ch));
                }
                else if (ch == ')' || ch == '}' || ch == ']') {
                    String lastParenthesis = s.peek();
                    char lastP = lastParenthesis.charAt(0);
                    if ((lastP == '(' & ch == ')') || (lastP == '{' & ch == '}') || (lastP == '[' & ch == ']')) {
                        s.pop();
                    }

                }
            }
            s.printStack();
            System.out.println();
            if (s.isEmpty()) {
                System.out.println("The Given Expression is Balanced.");
            } else {
                System.out.println("The Given Expression is not Balanced.");
            }
        }

    }

    public static void main(String[] args) {
        BalancePair b = new BalancePair();
        String ch = null;

        b.bal("{{}{}}{)");
    }
}
