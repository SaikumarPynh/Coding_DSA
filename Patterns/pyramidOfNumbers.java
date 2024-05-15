
public class pyramidOfNumbers {
    public static void nNumberTriangle(int n) {
        // Write your code here
                    int i = 1;
    for(int row = 0 ; row < n; row++){
            for (int num = 0; num < row+1;num++ ){
                System.out.print(i+" ");
                i++;
            }
            System.out.println();
        }
            }
}
// Input: ‘N’ = 3

// Output: 

// 1
// 2 3
// 4 5 6