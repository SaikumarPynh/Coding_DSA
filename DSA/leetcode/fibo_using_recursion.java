import java.util.Scanner;
public class fibo_using_recursion{
    static int fibo(int n){
        if(n<2){
            return n;
        }
        return fibo(n-1) + fibo(n - 2);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(fibo(num));
    }
}
    
