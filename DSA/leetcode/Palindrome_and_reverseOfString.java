import java.util.Stack;
class solution{
   static  String res = "";
    public static boolean solution(String s){
    
        Stack<Character> stack = new Stack<>();
        for(char i:s.toCharArray()){
            stack.push(i);
        }
    
        while(!stack.isEmpty()){
            res+=stack.pop();
        }

        if(s.equals(res)){
            return true;
        }else{
            return false;
        }
    }


    public static void main(String[] args){
        String s = "abba";
if(solution(s)){
    System.out.println("Palindrome");

}else{
    System.out.println(" Not a Palindrome");

}
System.out.print("reverse of string is:"+res);

    }

}