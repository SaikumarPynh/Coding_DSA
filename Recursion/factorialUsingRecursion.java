//https://www.geeksforgeeks.org/problems/find-all-factorial-numbers-less-than-or-equal-to-n3548/0?problemType=functional&difficulty%255B%255D=-1&page=1&query=problemTypefunctionaldifficulty%255B%255D-1page1
import java.util.ArrayList;
public class factorialUsingRecursion{
    static Long factorial(Long N){
        
        if(N == 1){
            return 1L;
        }
        return N * factorial(N-1);
    }
    
    static ArrayList<Long> factorialNumbers(Long N){
        ArrayList<Long> arr = new ArrayList<>();
        Long i = 1L;
        while(factorial(i) <= N){
            arr.add(factorial(i));
            i++;
        }
        return arr;

        // code here
        
    }
    // static ArrayList<Long> factorialNumbers(Long N){
    //     Long fact = 1L;
    //     Long i = 1L;
    //     ArrayList<Long> arr = new ArrayList<>();
    //     while(fact <= N){
    //         arr.add(fact);
    //         i++;
    //         fact *= i;
    //     }
    //     return arr;
    //     // code here
        
    // }
    
}