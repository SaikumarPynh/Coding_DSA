// “{}{}”, “{{}}”, “{{}{}}” are valid strings while “}{}”, “{}}{{}”, “{{}}}{“ are not valid strings.
//     Ninja wants to make ‘STR’ valid by performing some operations on it. In one operation, he can convert ‘{’ into ‘}’ or vice versa, and the cost of one such operation is 1.
    
//     Your task is to help Ninja determine the minimum cost to make ‘STR’ valid.
import java.util.Scanner;
class Valid{
    public static int result(int n, String str){

        char[] arr = str.toCharArray();
        int left = 0;
        int right = 0;
        int num = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == '{'){
                left += 1;
            }else if(arr[i] == '}'){
                right += 1;
            }
        }
        num = Math.abs(left - right);
        if(num == 0){
            return 0;
        }else if((num % 2) != 0){
            return -1;
        }else{
            return num / 2;
        }
    }
    public static void main(String[] args){
        //int n = sc.nextInt();
        int n  = 1;
        String str = "{}}{}}}";
        System.out.println(result(n,str));
    }
}