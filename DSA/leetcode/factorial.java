 import java.util.Scanner;
// public class factorial{
//     static int fact = 1;
//     public static int factorial(int n){
//         for(int i = n;i> 1;i--){
//             fact = fact * i;    
//         }
//     return fact;

// }
// public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     System.out.print(factorial(n));
// }
// }
//4! = 4 + 4 + 4 + 4 + 3 + 3 + 3 + 2 + 2 + 1

// import java.util.Scanner;

import java.util.Scanner;


 class Factorial {
    public static int factorial(int n) {
        int fact = 0;
        int currentAddition = 0;
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                currentAddition += n;
            }
            fact += currentAddition;
            currentAddition = 0; // Reset currentAddition for the next iteration
        }
        
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Factorial of " + n + " is " + factorial(n));
        sc.close();
    }
}
