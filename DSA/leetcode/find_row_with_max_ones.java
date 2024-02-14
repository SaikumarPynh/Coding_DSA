import java.util.ArrayList;
import java.util.Arrays;
class solution{
    public static int result(ArrayList<ArrayList<Integer>> matrix, int n, int m){ //n is rows and m columns
        int max = 0;
        int res = -1;
        for(int i = 0;i<m;i++){
            int count = 0;

            for(int j = 0;j< n;j++){
                count += matrix.get(i).get(j);
            }
            if( count > max){
                max = count;
                res = i;
            }
        }
        return res;
    }
    public static void main(String[] args){
        int m = 3;
        int n = 3;
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1,1,1)));
        matrix.add(new ArrayList<>(Arrays.asList(0,1,1)));
        matrix.add(new ArrayList<>(Arrays.asList(0,0,0)));
        System.out.println("The row with the maximum number of 1's is: " +
    result(matrix, n, m));
    }
}