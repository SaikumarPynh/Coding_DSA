class solution{
    static int len = 0;
    public static void result(int[] arr){
        for(int i = 0;i<arr.length;i++){
            int sum = 0;
            for(int j = i;j<arr.length;j++){
                sum+=arr[j];
                if (sum == 0){
                    len = Math.max(len,j - i + 1);
                }


            }
        }
        System.out.println("length of the substring having sum zero is:"+len);
    }
    public static void main(String[] args) {
        int[] arr =  {9, -3, 3, -1, 6, -5};
        result(arr);    
    }
}