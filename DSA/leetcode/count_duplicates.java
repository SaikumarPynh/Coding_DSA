import java.util.Stack;
class solution{
    public static int result(int[] arr){
         Stack<Integer> stack = new Stack<>();
        int count = 0;
        for(int i = 0;i<arr.length;i++){
            if(stack.isEmpty()){
                stack.push(arr[i]);
            } else if( stack.peek() != arr[i]){
            stack.push(arr[i]);
            }else if(stack.peek() == arr[i] ){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr =  {2,2,3,3,3,5,6};
        System.out.println(result(arr));    
    }
}