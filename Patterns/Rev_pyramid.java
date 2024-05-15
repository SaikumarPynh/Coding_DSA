// using three for loops making pyramid of stars


public class Rev_pyramid {
    public static void nStarTriangle(int n) {
        // Write your code here

        for(int row = 0;row<n;row++){
            for(int space = 0;space < row ; space++ ){
                System.out.print(" ");
            }
            for(int star  = 2*(n-row);star> 1;star--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}