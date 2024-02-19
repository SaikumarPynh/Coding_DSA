import java.util.Scanner;

class power{
    public static int result(int num,int n){
        int res = 1;
        for(int i = 0;i<n;i++){
            res *= num;
        }
        return res;
    }
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number:");
    int num = sc.nextInt();   
    System.out.println("Enter the power:");
    int n = sc.nextInt();
    System.out.print(result(num,n));
    }
}