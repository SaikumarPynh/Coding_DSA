import java.util.ArrayList;
import java.util.Arrays;
class solution{
    public static boolean result(ArrayList<ArrayList<Integer>> matrix,int m,int n,int target){
        for(int i = 0;i<m;i++){
            for(int j= 0;j<n;j++){
                if(matrix.get(i).get(n-1) > target){
                    if(matrix.get(i).get(j) == target){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public static void main(String[] args){
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        int m = 3;
        int n = 3;
        int target = 10;
        matrix.add(new ArrayList<>(Arrays.asList(1,2,3)));
        matrix.add(new ArrayList<>(Arrays.asList(4,5,6)));
        matrix.add(new ArrayList<>(Arrays.asList(7,8,9)));
        System.out.println("existance of "+target+" is "+result(matrix, m,n,target));
    }
}