class Solution {
    public static int strStr(String haystack, String needle) {
        int index = Integer.MAX_VALUE;
        int count =  0;
        int mlen = haystack.length();
        int slen = needle.length();
        for(int i= 0;i<= mlen - slen;i++){
            //system.out.println
            if(haystack.substring(i,i+slen).equals(needle)){
                index = Math.min(index,i);
                count++;
            }    
        }
        if(count == 0){
            return -1;
        }
        return index;
    }
    public static void main(String[] args){
        String s1 = "saikumarp";
        String s2 = "kum";
        System.out.println(Solution.strStr(s1,s2));
    }
}