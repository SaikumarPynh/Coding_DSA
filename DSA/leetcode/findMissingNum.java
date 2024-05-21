
public class findMissingNum {
    public int missingNumber(int[] nums) {
        // for(int i = 0;i< nums.length;i++){
        //     int min = i;
        //     int j = i+1;
        //     while(j < nums.length){
        //         if(nums[j]< nums[min]){
        //             min = j;
        //         }
        //         j++;
        //     }
        //     int temp = nums[i];
        //     nums[i] = nums[min];
        //     nums[min] = temp;


        // }
        // int ele = nums.length;
        // for(int m = 0;m<nums.length;m++){
        //     if(nums[m] != m){
        //         ele =  m;
        //     }
        // }
        // return ele = -1;
        int n = nums.length;
        int sum = n*(n+1) / 2;
        int asum = 0;
        for(int i = 0;i<n;i++){
            asum+=nums[i];
        }
        if(sum != asum){
            return sum - asum;
        }else{
            return 0;
        }
    }
}