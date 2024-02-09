public class Move_zero_to_last{
    public static void solve(int[] arr, int n) {
        int count = 0;
            for (int i = 0; i < n ; i++) {
            if (arr[i] != 0) {
                arr[count] = arr[i];
                count++;
            }
        }
        while(count != n){
            arr[count] = 0;
            count++;
        }
        for(int i:arr){
            System.out.print(i+" ");
        }
    }

    public static void main(String args[]) {
        int n = 10;

        int arr[] = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        solve(arr, n);
    }
}
