import java.util.Scanner;
public class fibo_using_recursion{
    static int fibo_nth_term(int n){
        if(n<2){
            return n;
        }
        return fibo_nth_term(n-1) + fibo_nth_term(n - 2);
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num+"th term is "+fibo_nth_term(num));
        System.out.println("fibo series upto "+num+"th term is");

        for(int i = 0;i<num;i++){
            System.out.print(fibo_nth_term(i)+" ");
        }
    }
}
    
