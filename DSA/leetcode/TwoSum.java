import java.util.HashMap;
import java.util.Map;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        // int m = 0;
        // int n = 0;
        // for(int i = 0;i<nums.length - 1;i++){
        //     for(int j = i+1;j<nums.length;j++){
        //         if((nums[i] + nums[j]) == target){
        //             m = i;
        //             n = j;
        //         }
        //     }
        // }
        // return new int[] {m,n};
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i< nums.length;i++){
            int ele = target - nums[i];
            if(map.containsKey(ele)){
                return new int[] {i,map.get(ele)};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }
}