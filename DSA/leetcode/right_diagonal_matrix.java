import java.util.ArrayList;
import java.util.Arrays;
class solution{
    public static ArrayList<ArrayList<Integer>> result(ArrayList<ArrayList<Integer>> matrix, int m,int n){
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(i<=j){
                    matrix.get(i).set(j,1);
                }else{
                    matrix.get(i).set(j,0);
                }
            }
        }            return matrix;

    }
        public static void main(String[] args){
            ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
            matrix.add(new ArrayList<>(Arrays.asList(1,2,3)));
            matrix.add(new ArrayList<>(Arrays.asList(4,5,6)));
            matrix.add(new ArrayList<>(Arrays.asList(7,8,9)));
            int m = 3;
            int n = 3;
            System.out.println(result(matrix,m,n));
        }
    }