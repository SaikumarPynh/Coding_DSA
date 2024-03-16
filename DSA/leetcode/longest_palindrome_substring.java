import java.util.Scanner;
class Solution {
    public String longestPalindrome(String str) {
        if(str.length() == 1){
            return str;
        }
        String maxsubstr = str.substring(0, 1);
        int maxlen = 1;
        for(int i = 0;i<str.length();i++){
            for(int j = i + 1;j<=str.length();j++){
                if(j-i+1 > maxlen && isPalindrome(str.substring(i,j))){
                    maxlen = j-i;
                    maxsubstr = str.substring(i,j);
                }
            }
        }
        return maxsubstr;
    }
    public boolean isPalindrome(String s){
        int left = 0;
        int right = s.length()-1;
        while(left < right ){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args){
        Solution obj  = new Solution();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        // String r = str.substring(0, 1);
        // System.out.println(r);
        System.out.print(obj.longestPalindrome(str));
    }
}