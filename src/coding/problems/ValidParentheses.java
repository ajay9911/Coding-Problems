package coding.problems;


import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                        (c == '}' && top != '{') ||
                        (c == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        ValidParentheses solution = new  ValidParentheses();

        System.out.println(solution.isValid("()")); // Output: true
        System.out.println(solution.isValid("()[]{}")); // Output: true
        System.out.println(solution.isValid("(]")); // Output: false
        System.out.println(solution.isValid("([])")); // Output: true
    }
}

