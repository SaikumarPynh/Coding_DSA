import java.util.HashMap;
class solution{
   static HashMap<Integer,Integer> map = new HashMap<>();
    static int res = 0;
    public static void result(int[] arr){
        int l = arr.length / 2;
        for(int i = 0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);

        }
        for(int i:map.keySet()){
            if(map.get(i)>l){
                res = i;               
            }
        }
        System.out.print(res);

    }
    public static void main(String[] args) {
        int[] arr = { 1, 2,2,2,2, 4};
        result(arr);
    }
}