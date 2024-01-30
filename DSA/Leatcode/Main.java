import java.util.Stack;

class Solution {
    public int evalRPN(String[] tokens) {
        int operand1,operand2,val;
        Stack<Integer> stack = new Stack<>();
        for (String token:tokens){
            if("+-*/".contains(token)){
               
                operand2 = stack.pop();
                operand1 = stack.pop();
                switch(token){
                    case  "+":
                    val =  operand1 + operand2;
                    break;
                    case  "-":
                    val = operand1 - operand2;
                    break;
                    case  "*":
                    val =  operand1 * operand2;
                    break;
                    case "/":
                    val =  operand1 / operand2;
                    break;
                      default:
                        throw new IllegalArgumentException("Invalid operator: " + token);

                }
                stack.push(val);
            }else{
                     stack.push(Integer.parseInt(token));
                }
        }
        return stack.pop();
    }
  
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1:
        String[] tokens1 = {"2", "1", "+", "3", "*"};
        System.out.println("Result 1: " + solution.evalRPN(tokens1)); // Output: 9

        // Example 2:
        String[] tokens2 = {"4", "13", "5", "/", "+"};
        System.out.println("Result 2: " + solution.evalRPN(tokens2)); // Output: 6

        // Example 3:
        String[] tokens3 = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
        System.out.println("Result 3: " + solution.evalRPN(tokens3)); // Output: 22
    }
}
