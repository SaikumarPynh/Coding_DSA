class Solution {
    public int findPeakElement(int[] nums) {
        int ind = 0;
        int min = nums[0];
        for(int i = 1;i<=nums.length - 1;i++){
            if(nums[i] > min){
                min = nums[i];
                ind = i;
            }
        } return ind;
    }
}
public class peek_ele_Stack{
    public static void main(String[] args){
        Solution s = new Solution();
        int[] lis = {33,5,8,3,8};
        System.out.println(s.findPeakElement(lis));
    }
}
