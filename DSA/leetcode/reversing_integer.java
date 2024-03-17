 class Solution {
    // public int reverse(int x) {
    //     int digit = 0;
    //     int res = 0;
       
    //     String str = Integer.toString(x);
    //     if(x > 0) {
    //         for(int i = str.length()-1; i >= 0 ; i--) {
    //             digit = x % 10;
    //             x /= 10;
    //             res += digit * Math.pow(10, i);
    //         }
    //     } else {
    //         for(int i = str.length()-2; i >= 0 ; i--) {
    //             digit = x % 10;
    //             x /= 10;
    //             res += digit * Math.pow(10, i);
    //         }
    //     }
    //     return res;
    // }

    public int reverse(int x){
        int val = Math.abs(x);
        int res = 0;
        while(val > 0){
            int digit = val % 10;
            res = res * 10 + digit;
            val /= 10;
        }
        if (x > 0){
            return res;
        }else{
            return -1 * res;
        }
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Example usage
        int reversed = solution.reverse(123);
        System.out.println("Reversed number   : " + reversed);
    }
}
 
