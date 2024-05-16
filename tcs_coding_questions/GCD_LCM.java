// public class GCD_LCM  {
//     static Long[] lcmAndGcd(Long A , Long B) {
//         Long Gcd = 1L;        
//         for(Long i = 1L;i<=Math.min(A,B);i++){
//             if(A % i == 0 && B % i == 0){
//                 Gcd = i;
//             }
//         }
//         Long Lcm = Math.abs(A * B) / Gcd;
//         return new Long[] {Lcm, Gcd};
//     }
// }

public class GCD_LCM  {
    static int[] lcmAndGcd(int A , int B) {
        int Gcd = 1;        
        for(int i = 1;i<=Math.min(A,B);i++){
            if(A % i == 0 && B % i == 0){
                Gcd = i;
            }
        }
        int Lcm = Math.abs(A * B) / Gcd;
        return new int[] {Lcm, Gcd};
    }
}