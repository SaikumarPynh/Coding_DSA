class solution{
    public static void consecutive(int[] arr){
        int max = 1;
        int count = 0;

        for(int i = 0; i< arr.length - 1;i++){
            if(arr[i] == arr[i+1]){
                count++;
            }else{
                count = 1;
            }
            if(count > max){
                max = count;
            }
        }
        System.out.print(max);
    }
    public static void main(String[] args){
        int[] arr = {1, 1, 0, 1, 1, 1};
        consecutive(arr);
    }
}   