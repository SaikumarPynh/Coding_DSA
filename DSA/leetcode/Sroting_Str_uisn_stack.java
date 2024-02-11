import java.util.Stack;

class Main {
    public  char[] reverse(String str) {
        char[] chars = str.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char c : chars) {
            stack.push(c);
        }
        for (int i = 0; i < chars.length; i++) {
            chars[i] = stack.pop();
        }
        return chars;
    }
}
public class Sroting_Str_uisn_stack{


    public static void main(String[] args) {
        Main m = new Main();
        String str = "Reverse me";

        // Reverse the string
        char[] reversedChars = m.reverse(str);

        // Convert char array to String for printing
        String reversedString = new String(reversedChars);

        System.out.println(reversedString);
    }

}