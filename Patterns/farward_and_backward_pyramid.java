public class farward_and_backward_pyramid {
    public static void nStarDiamond(int n) {
        for (int row = 0; row < n; row++) {
            for (int space = n - 1 - row; space > 0; space--) { // Corrected typo
                System.out.print(" ");
            }
            for (int star = 0; star < 2 * row + 1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int row = 0; row < n; row++) {
            for (int space = 0; space < row; space++) {
                System.out.print(" ");
            }
            for (int star = 0; star < 2 * (n - row) - 1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


//farward_and_backward_pyramid