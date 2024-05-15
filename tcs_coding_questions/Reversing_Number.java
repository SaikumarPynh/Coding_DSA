class Reversing_Number {
    public int reverse(int x) {
        // int num  = x;
        int sum = 0;
        while(x != 0){
            int digit  = x % 10;
            x = x / 10;
            if(Math.abs(sum) > Integer.MAX_VALUE / 10){
                return 0;
            }
            sum = sum * 10+digit;
        }
        return sum;
    }
}