class solution{
    public static void result(int[] arr){
        int max = Integer.MIN_VALUE;

        for(int i = 0;i<arr.length;i++){
            int sum = 0;
            for(int j = i;j<arr.length;j++){
                sum+=arr[j];
                max = Math.max(max,sum);
            }
        }
        System.out.println("maximum sum of a subarray is:"+max);
    }
    public static void main(String[] args){
        int[] arr = {-2, 1, -3, -4, -1, 2, 8, -5, 4};
        result(arr);
    }
}