package week3;


import java.util.Stack;
public class Infix {

    static int precedence(char charctr)
    {
        return switch (charctr) {
            case '+', '-' -> 1;
            case '*', '/' -> 2;
            case '^' -> 3;
            default -> -1;
        };
    }

    static String infixToPostfix(String expression)
    {
        StringBuilder rsult = new StringBuilder();

        Stack<Character> stak = new Stack<>();

        for (int i = 0; i<expression.length(); ++i)
        {
            char c = expression.charAt(i);

            /* ================= If the scanned character is an operand, add it to output. */
            if (Character.isLetterOrDigit(c))
                rsult.append(c);

                /* ================= If the scanned character is an '(', push it to the stack. */
            else if (c == '(')
                stak.push(c);

                /* ================= If the scanned character is an ')',pop and output from the stack until an '(' is encountered. */
            else if (c == ')')
            {
                while (!stak.isEmpty() &&
                        stak.peek() != '(')
                    rsult.append(stak.pop());

                stak.pop();
            }
            else // an operator is encountered
            {
                while (!stak.isEmpty() && precedence(c)
                        <= precedence(stak.peek())){

                    rsult.append(stak.pop());
                }
                stak.push(c);
            }

        }

// ============================== pop all the operators from the stack ==========================
        while (!stak.isEmpty()){
            if(stak.peek() == '(')
                return "Invalid Expression";
            rsult.append(stak.pop());
        }
        return rsult.toString();
    }

    public static class PostfixEval {

        static int evalPostfix(String expression)
        {
            Stack<Integer> stck = new Stack<Integer>();

            for(int i=0; i < expression.length(); i++)
            {
                char ch = expression.charAt(i);

                if(Character.isDigit(ch))
                    stck.push(ch - '0');

                else
                {
                    int firstvalue = stck.pop();
                    int secondvalue = stck.pop();
                    switch (ch) {
                        case '+' -> stck.push(secondvalue + firstvalue);
                        case '-' -> stck.push(secondvalue - firstvalue);
                        case '*' -> stck.push(secondvalue * firstvalue);
                        case '/' -> stck.push(secondvalue / firstvalue);
                    }
                }
            }
            return stck.pop();
        }

    }

    public static void main(String[] args) {
        String expression = "4*(5+6)";
        String postfixExpression = infixToPostfix(expression);
        System.out.println("RPN conversion: "+postfixExpression);
        new PostfixEval();
        System.out.println("Evaluated value: "+ PostfixEval.evalPostfix(postfixExpression));
    }
}




