class solution{
    public static void result(int[] arr){
    int max = Integer.MIN_VALUE;
    int sum = 0;
    for(int i = 0; i<arr.length;i++){
        sum += arr[i];
        if(sum > max){
            max = sum;
        }
        if(sum < 0){
            sum = 0;
        }
    }
    System.out.print("maxim sum of the subarray is:"+max);
}

    
    public static void main(String[] args){
        int[] arr = {-2, 1, -3, -4, -1, 3, 8, -5, 4};
        result(arr);
    }
}