class solution{
    public static boolean result(String str){
        int  right = str.length() - 1;
        int  left = 0;
        while(left < right){
            char charleft = str.charAt(left);
            char charright = str.charAt(right);
            if(!Character.isLetterOrDigit(charleft)){
                left++;
            }else if(!Character.isLetterOrDigit(charright)){
                right--;
            }else{
                if (Character.toLowerCase(charleft) != Character.toLowerCase(charright)){
                    return false;
                    }
                    
                    left++;
                    right--;
            }
            
        }
        return true;
    }
    public static void main(String[] args){
        String s = "A man, a plan, a canal: Panama";
        System.out.print(result(s));
    }
}