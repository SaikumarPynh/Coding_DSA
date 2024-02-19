import java.util.HashSet;
import java.util.Scanner;
class solution{
    public static boolean result(String str,HashSet<Character> set){
        for(char c:str.toCharArray()){
            if(set.contains(c)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        HashSet<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.print(result(str,set));
    }
}