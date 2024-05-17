import java.util.ArrayList;
public class factorialUsingRecursion{
    
    static ArrayList<Long> factorialNumbers(Long N){
        Long fact = 1L;
        Long i = 1L;
        ArrayList<Long> arr = new ArrayList<>();
        while(fact <= N){
            arr.add(fact);
            i++;
            fact *= i;
        }
        return arr;
        // code here
        
    }
}