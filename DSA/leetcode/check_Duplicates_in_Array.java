import java.util.HashMap;

class check_Duplicates_in_Array {
    public boolean containsDuplicate(int[] nums) {
        //using counting approach
        int max = nums[0];
        for(int ele:nums){
            if(ele > max){
                max = ele;
            }
        }
        //initialising the counting counting array with all elelments as zero
        int[] arr = new int[max + 1];
        for(int ele : nums){
            arr[ele] += 1;
            if(arr[ele] > 1){
                return true;
            }
        }
        return false;
        // HashMap<Integer,Integer> map = new HashMap<>();
        // for(int ele:nums){
        //     map.put(ele,map.getOrDefault(ele,0)+1);
        //     if(map.get(ele) > 1){
        //         return true;
        //     }
        // }
        // return false;
    }
}
