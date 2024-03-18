import java.util.Scanner;
public class regex{
    public boolean compare(String input, String pattern){
            int i = 0;
            int j = 0;
            while(i<input.length() && j < pattern.length()){
                if(pattern.charAt(j) == '.'){
                    i++;
                    j++;
                }else if(pattern.charAt(j) == '*'){
                    if(pattern.charAt(j-1)!='.' && pattern.charAt(j-1) != input.charAt(i)) {
                    j++;
                    }else{
                        i++;
                    }
                }else{
                    if(pattern.charAt(j) != input.charAt(i)) {
                        return false;
                    }else{
                        i++;
                        j++;
                    }
                }
            }
        return true;
    }
    public static void main(String[] args){
        regex obj = new regex();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the input String: ");
        String input = sc.next();
        System.out.println("enter the pattern String: ");
        String pattern = sc.next();
        System.out.println(obj.compare(input,pattern));
    }
}
