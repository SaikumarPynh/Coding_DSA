class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String shortestString = strs[0];
        for (String str : strs) {
            if (str.length() < shortestString.length()) {
                shortestString = str;
            }
        }
        int count  = 0;
        boolean val = true;
        StringBuilder s = new StringBuilder();
        while(val && count < shortestString.length()){
            for(int i=1;i<strs.length;i++){
                if(strs[i].charAt(count) != strs[0].charAt(count)){
                    val = false;
                    return s.toString();

                    
                }
            }
            s.append(strs[0].charAt(count));
            count++;
        }

        return s.toString();
    }
}
    public static void main(String[] args) {
        Solution obj = new Solution();
        String[] strs = {"flower","flow","floght"};
        System.out.println(obj.longestCommonPrefix(strs));
    }
}