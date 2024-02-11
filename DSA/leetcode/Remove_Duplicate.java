import java.util.HashSet;
public class Remove_Duplicate{
    public static void solution(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        for(int i:arr){
        set.add(i);
        }
        for(int i:set){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args){
        int[] arr = {1,2,2,3,3,5,6,6,7};
        solution(arr);
    }
}