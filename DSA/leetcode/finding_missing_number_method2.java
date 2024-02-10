class solution{
    public static void result(int[] arr){
        int sum = 0;
        for(int i:arr){
            sum += i;
        }
        int n = arr.length + 1;
        int nsum = (n*(n+1))/2;
        if(nsum != sum){
            System.out.println("missing number is:"+(nsum-sum));
        }else{
            System.out.println("no missing number is find:");

        }
    }
    public static void main(String args[]) {
        int arr[] = {1, 2, 4, 5};

        result(arr);
        // System.out.println("The missing number is: " + ans);
    }

}