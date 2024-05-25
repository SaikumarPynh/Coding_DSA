//https://leetcode.com/problems/sort-colors/
class SortingThreeColors {
    public void sortColors(int[] nums) {
        for(int i = 0;i<nums.length - 1;i++){
            int min = i;
            int j = i;
            while( j < nums.length){
                if(nums[min] > nums[j]){
                    min = j;
                }
                j++;
            }
            int temp = nums[min];
            nums[min] = nums[i];
            nums[i] = temp;
        }
    }
}
