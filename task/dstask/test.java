 import java.util.Stack;


   public class test {

   



    public static boolean isValidExpression(String expression) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    return false; 
                }

                char top = stack.pop();

                if ((ch == ')' && top != '(') || (ch == '}' && top != '{') || (ch == ']' && top != '[')) {
                    return false; 
                }
            }
        }

        return stack.isEmpty(); 
    }

    public static void main(String[] args) {
        String expression1 = "{[()]}";
        String expression2 = "{[()]}()";
        String expression3 = "{[()]})";

        System.out.println(isValidExpression(expression1)); 
        System.out.println(isValidExpression(expression2)); 
        System.out.println(isValidExpression(expression3)); 
    }
}