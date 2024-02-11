import java.util.Scanner;
import java.util.Stack;

class Solution {
    public String reverseWords(String s) {
        Stack<String> stack = new Stack<>();
        String[] words = s.split(" ");

        for (String word : words) {
            stack.push(word);
        }

        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append(stack.pop()).append(" ");
        }

        return result.toString().trim();
    }
}

public class RevWords {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        String s = sc.nextLine(); // Use nextLine() to read the entire line
        Solution obj = new Solution();

        System.out.println(obj.reverseWords(s));
    }
}
