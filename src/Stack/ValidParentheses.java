package Stack;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {

        String str = "({[]})";

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            else {

                if (stack.isEmpty()) {
                    System.out.println("Invalid");
                    return;
                }

                char top = stack.pop();

                if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) {

                    System.out.println("Invalid");
                    return;
                }
            }
        }

        if (stack.isEmpty())
            System.out.println("Valid");
        else
            System.out.println("Invalid");
    }
}