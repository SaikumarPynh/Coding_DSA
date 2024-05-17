//https://www.geeksforgeeks.org/problems/sum-of-first-n-terms5843/1
class sumOfCubeUptoN {
    int digit = 1;
    int sum = 0;
    
    int sumOfSeries(int n) {
        // code here
        sum += Math.pow(digit, 3);
        digit++;
        if(digit > n){
            return sum;
        }
        return sumOfSeries(n);
        
    }
}
