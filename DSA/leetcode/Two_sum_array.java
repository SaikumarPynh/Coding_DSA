import java.util.Map;
import java.util.HashMap;


class Solution{
   static  Map<Integer,Integer>  map= new HashMap<>();
    public static void sol(int[] nums,int target){
        for(int i = 0;i<nums.length;i++){
            if(map.containsKey(target - nums[i])){
                System.out.printf("match found:(%d,%d)",nums[i],nums[map.get(nums[i] - target)]);
                return;
            }
            map.put(nums[i],i);
        }
        System.out.println("Pair not found");


    }
    public static void main(String[] args){
        int[] nums = { 8, 7, 2, 5, 3, 1};
        int sum = 10;
        sol(nums,sum);
    }
}