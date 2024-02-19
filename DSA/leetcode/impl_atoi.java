import java.util.Stack;
class impl_atoi{
   static  Stack<Character> stack = new Stack<>();
    public static void result(String str){
       char [] arr = str.toCharArray();
        for(char  c : arr){
            if(stack.isEmpty()){
                if(Character.isDigit(c)){
                    stack.push(c);
                }else if(Character.isLetter(c)){
                    return;
                }else if(c == '+' || c == '-'){
                    stack.push(c);
                }
            }else{

                if(Character.is(c)){
                    stack.push(c);
                }else if(Character.isLetter(c)){

                }
            }      
    }
    int n = stack.size();
    int [] arr1 = new int[n];
    
    for(int i = 0;i< n;i++){
        arr1[i] = stack.pop();
        System.out.print(arr[i]);
    }

}
public static void main(String[] args){
    String str= "45rohit12";
    result(str);
}
}