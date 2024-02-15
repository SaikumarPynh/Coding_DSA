import java.util.HashMap;
import java.util.Map;

class solution{
    public static String result(HashMap<String,Integer> map, int target){
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            if(entry.getValue().equals(target)){
                return entry.getKey();
            }
        }
        return null;
    }
    public static void main(String[] args){
        HashMap<String,Integer> map = new HashMap<>();
        map.put("a" ,1);
        map.put("b" ,2);
        map.put("c" ,3);
        map.put("d" ,4);
        int target = 3;
        System.out.println(result(map,target));
    }
}