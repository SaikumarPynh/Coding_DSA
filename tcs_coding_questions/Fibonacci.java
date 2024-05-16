import java.util.Scanner;
import java.util.ArrayList;
public class Fibonacci {
    ArrayList<Integer> arr = new ArrayList<>();
    int a = 0;
    int b = 1;
    // arr.add(a);
    // arr.add(b);
    // public Fibonacci() {
    //     // Constructor to initialize the ArrayList with the first two Fibonacci numbers
    //     arr.add(a);
    //     arr.add(b);
    // }
    public  ArrayList<Integer> fibo(int n){
        // arr.clear(); // Ensure the ArrayList is empty before adding Fibonacci numbers

            arr.add(a);
            arr.add(b);
        for(int i = 2;i<n;i++){
            int temp = b;
            b = a+b;
            a = temp;
            arr.add(b);
        }
        return arr;
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Length of the fibonacci series");
    int target = sc.nextInt();
        Fibonacci fibo = new Fibonacci();
        System.out.println(fibo.fibo(target));
}
}

