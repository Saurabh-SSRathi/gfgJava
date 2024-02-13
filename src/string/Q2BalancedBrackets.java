package string;

import java.util.Stack;

public class Q2BalancedBrackets {

    public static boolean areParenthesesBalanced(String str) {
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            if(ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {

                if (stack.empty()) {
                    return  false; // Closing parenthesis with no corresponding opening parenthesis
                }

                char top = stack.pop();
                if (!((top == '(' && ch == ')') || (top == '{' && ch == '}') || (top == '[' && ch == ']'))) {
                    return false; //mismatched parenthesis
                }
            }
        }
        return stack.empty(); // if stack is empty, all the parentheses are balanced
    }

    public static void main(String[] args) {
        boolean valid = Q2BalancedBrackets.areParenthesesBalanced("{[a+b]()[a*]}");
        System.out.println(valid);
    }
}
