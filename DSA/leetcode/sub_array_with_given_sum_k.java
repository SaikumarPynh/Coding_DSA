class solution{
    public static void result(int[] arr,int k){
        int len = 0;
        for(int i = 0; i<arr.length;i++){
            int sum = 0;
            for(int j = i;j<arr.length;j++){
                sum += arr[j];
                if(sum == k){
                    len = Math.max(len,j-i+1);
                }

            }
        }
    
   
    System.out.print("length of the substring is:"+len);
    }
    public static void main(String[] args){
        int target  = 2;
        int[] arr = {2, 3, 5, 1, 9};
        result(arr,target);
    }
}