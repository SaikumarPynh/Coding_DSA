// """
//     You are given an array prices where prices[i] is the price of a given stock on the ith day.

//     You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
    
//     Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
//         """

class solution{
    public static void result(int[] arr){
        int minValu  = arr[0];
        int maxprof = 0;
        for(int i = 1;i<arr.length;i++){
            maxprof = Math.max(maxprof,arr[i] - minValu);
            minValu = Math.min(minValu,arr[i]);
        }
        System.out.print(maxprof);
    }

    public static void main(String[] args){
        int[] arr = {3,8,7,5,4,3,2,1};
        result(arr);
    }
}