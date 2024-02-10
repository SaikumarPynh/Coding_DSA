class solution{
    public static void result(int[] arr){
        int zeros = 0;
        int twos = 0;
        int ones = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == '0'){
                zeros++;
            }else if(arr[i] == '1'){
                ones++;
            }else if(arr[i] == '2'){
                twos++;
            }

        }
        for(int i = 0;i<zeros;i++){
            arr[i] = 0;
        }
        for(int i = 0;i<ones;i++){
            arr[i] = 1;
        }
        for(int i = 0;i<twos;i++){
            arr[i] = 2;
        }
    
    for(int i:arr){
        System.out.print(i+" ");
    }
}
    public static void main(String[] args){
        int[] arr = {2,0,2,1,1,0};
        result(arr);
    }
}