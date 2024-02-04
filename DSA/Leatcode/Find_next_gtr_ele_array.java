import java.util.Arrays;
class Solution {
    int[] Res;

    public int[] getResult(int[] lis){
        Res = new int[lis.length]; // Initialize Res array

        for(int i = 0;i < lis.length-1;i++){
            int max = lis[i];
            for(int j = i+1; j<lis.length;j++){
                if(lis[j] > max){
                    max = lis[j];
                }
            }
            if(max == lis[i]){
                max = -1;
                Res[i] = max;
            
        }else{
            Res[i] = max;
        }
    }Res[lis.length - 1] = -1;
    return Res;
}
    public static void main(String[] args) {
        System.out.println("Hello from a non-public class!");
        Solution s = new Solution();
        int[] Lis = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(s.getResult(Lis)));
    }
}