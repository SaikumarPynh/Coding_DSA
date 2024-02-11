import java.util.HashMap;
class solution{
    public static void result(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int a:arr){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        int val  = 0;
        int max = 0;
        for(int i:map.keySet()){
            if(map.get(i) > max){
                
                max = map.get(i);
                 val = i;
            }
        }       
         System.out.print("element  :"+val+" is occured "+ max+"times");

    }
    public static void main(String[] args){
        int[] arr = {4,5, 0,4 ,1, 1, 1};
        result(arr);
    }
}