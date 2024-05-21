
public class movingZeroesToENd {
    public void moveZeroes(int[] nums) {
        int j = 0;
        for(int i = 0;i< nums.length;i++){
            if(nums[i] != 0){
                nums[j] = nums[i];
                j++;
            }
        }
        while(j < nums.length){
            nums[j] = 0;
            j++;
        }
        // for(int i = 1;i< nums.length;i++){
        //     if(nums[i] != 0){
        //         // nums[j] = nums[i];
        //         // j++;
        //         int temp = nums[i];
        //         nums[i] = nums[j];
        //         nums[j] = temp;
        //         j++;
        //     }
        // }
    }
}