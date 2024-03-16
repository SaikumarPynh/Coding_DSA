// https://leetcode.com/problems/zigzag-conversion/
class Solution {
    public String convert(String s, int numRows) {
            int diff = numRows * 2 - 2;
            int secondIndex;
            int diagdiff = diff;
            int index;
            StringBuilder str = new StringBuilder();

        for(int i = 0;i<numRows;i++){
            index = i;
            while(index < s.length()){
                str.append(s.charAt(index));
                if(i!=0 && i!=numRows-1){
                    diagdiff = diff - 2 * i;
                    secondIndex = index + diagdiff;
                    if(secondIndex < s.length()){
                        str.append(s.charAt(secondIndex));
                    }
                }
               index+=diff; 
            }
        }
        return str.toString();
    }
        public static void main(String[] args) {
            Solution solution = new Solution();
            String s = "PAYPALISHIRING";
            int numRows = 3;
            System.out.println(solution.convert(s, numRows));
        }
}