class solution{
    public static void result(int[] arr1,int[] arr2){
        for(int i = 0;i<arr1.length;i++){
            for(int j = 0;j<arr2.length;j++){
                if(arr1[i] > arr2[j]){
                    int temp = arr2[j];
                    arr2[j] =arr1[i];
                    arr1[i] = temp;
                }
            }
        }
        for(int i = 0;i<arr1.length;i++){
            System.out.print(arr1[i]);
        }
        for(int i = 0;i<arr2.length;i++){
            System.out.print(arr2[i]);
        }
    }
    public static void main(String[] args) {
        int[] arr1 =  {1,4 ,8 };
        int[] arr2 = {2 ,3 ,9};

        result(arr1,arr2);    
    }
}