import java.util.HashMap;
import java.util.Map;
class  MejarityElement{
    public int majorityElement(int[] nums) {
        int len = nums.length / 2;
        Map<Integer,Integer> map = new HashMap<>();
        for(int ele:nums){
            if(map.containsKey(ele)){
                map.put(ele,map.get(ele)+1);
            }else{
                map.put(ele,1);
            }
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()> len ){
                return entry.getKey();
            }
        }
        return -1;
    }
}