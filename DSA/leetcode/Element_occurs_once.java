import java.util.HashMap;
class solution{
    static HashMap<Integer,Integer> map = new HashMap<>();
    public static void result(int arr[])  {
        for(Integer i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int key:map.keySet()){
            if(map.get(key) == 1){
                System.out.println("element with occurence one is:"+key);
            }
        }
    }
    public static void main(String[] args){
        int[] arr = {1, 1, 0,4 ,1, 1, 1};
        result(arr);
    }
}