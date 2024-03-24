import java.util.ArrayList;
import java.util.List;

 class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generateParenthesisHelper(n, n, "", result);
        return result;
    }

    private void generateParenthesisHelper(int openCount, int closeCount, String current, List<String> result) {
        // Base case: if both openCount and closeCount become 0, add current combination to the result
        if (openCount == 0 && closeCount == 0) {
            result.add(current);
            return;
        }

        // Recursive cases:
        // If there are still open brackets left, add an open bracket and recursively call the function
        if (openCount > 0) {
            generateParenthesisHelper(openCount - 1, closeCount, current + "(", result);
        }
        // If there are more open brackets than close brackets, add a close bracket and recursively call the function
        if (closeCount > openCount) {
            generateParenthesisHelper(openCount, closeCount - 1, current + ")", result);
        }
    }

    public static void main(String[] args) {
        GenerateParentheses generator = new GenerateParentheses();
        
        // Example 1
        int n1 = 3;
        List<String> result1 = generator.generateParenthesis(n1);
        System.out.println("Output for n = " + n1 + ": " + result1);

        // Example 2
        int n2 = 3;
        List<String> result2 = generator.generateParenthesis(n2);
        System.out.println("Output for n = " + n2 + ": " + result2);
    }
}
