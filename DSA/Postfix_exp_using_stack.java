import java.util.Stack;
public class Postfix_exp_using_stack{
    Stack<Integer> stack;
    public Postfix_exp_using_stack(){
        stack = new Stack<>();
    }
    public int calculate(String exp){
        for(char c : exp.toCharArray()){
            if(Character.isDigit(c)){
                stack.push(Character.getNumericValue(c));
            }
            else{
                if(c == '+' || c == '*' || c == '/'){
                    int a = stack.pop();
                    int b = stack.pop();
                    int r;
                    switch(c){
                        case '+':
                            r = a + b;
                            stack.push(r);
                            break;
                        case '/':
                            r = b / a;
                            stack.push(r);
                            break;
                        case '*':
                            r = a * b;                            
                            stack.push(r);
                            break;
                    }

                }
            }
        }return stack.peek();

    }
    public static void main(String[] args){
        Postfix_exp_using_stack p = new Postfix_exp_using_stack();
        String str = "545*+5/";
        System.out.println(p.calculate(str));
    }


}