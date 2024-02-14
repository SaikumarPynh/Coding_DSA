class Solution {
    public static int maxDepth(String s) {
        // Write your code here.
     int count =0;
     int maxDepth = 0;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == '('){
                count++;
                maxDepth = Math.max(maxDepth,count);
            }else if(s.charAt(i) == ')'){
                 count--;
            }
        }
    return maxDepth;
    }public static void main(String[] args){
        String s = "(3*(4*(5*(6))))";
        System.out.println(maxDepth(s));
    }

}