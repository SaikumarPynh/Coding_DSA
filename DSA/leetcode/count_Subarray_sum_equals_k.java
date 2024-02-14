class Solution {
    public static void result(int[] arr, int k) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == k) {
                    count++;
                } else if (sum > k) {
                    break; // Break out of the inner loop if sum becomes greater than k
                }
            }
        }
        System.out.println("Result is " + count);
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 4};
        int k = 6;  
        result(arr, k);
    }
}
