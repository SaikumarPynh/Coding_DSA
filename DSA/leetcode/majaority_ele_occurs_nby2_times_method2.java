import java.util.HashMap;
import java.util.Map;
class solution{
    static Map<Integer,Integer> map = new HashMap<>();
    public static void result(int[] arr){
        int target = arr.length / 2;
        for(int i = 0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(int i:map.keySet()){
            if(map.get(i) > target){
                System.out.println("element that occurs more than the n/2 of array length is:"+i);
            }
        }
    }
    public static void main(String[] args){
        int[] arr = {2,0,2,1,1,2,2,5,5,5,5,5,5,5,5,5,5};
        result(arr);
    }
}