
public class StringPalindrome {
    public boolean isPalindrome(String s) {
    int left = 0;
    int right = s.length() - 1;
      return palindrome(s,left , right);
    }
    public boolean palindrome(String s,int left, int right){
        while(left <= right){
        while(left < right && !Character.isLetterOrDigit(s.charAt(left))){
            left++;
        }
        while(left < right && !Character.isLetterOrDigit(s.charAt(right))){
            right--;
        }
if( left <= right &&  Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
            return false;
        }

        left++;
        right--;
        }
        return true;
    }
    }