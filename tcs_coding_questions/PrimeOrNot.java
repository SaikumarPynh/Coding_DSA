import java.util.Scanner;
public class PrimeOrNot {
    public boolean result(int n){
        for(int i = 3;i<=n/2;i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        PrimeOrNot pm = new PrimeOrNot();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n  = sc.nextInt();
        System.out.println(pm.result(n));


    }
}
