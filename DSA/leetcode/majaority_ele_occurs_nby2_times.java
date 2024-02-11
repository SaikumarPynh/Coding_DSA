class solution {
    public static void result(int[] arr){
        int target = arr.length / 2;
        int ele = arr[0];

        for(int i = 0;i<arr.length;i++){
            int count = 0;

            for(int j = i;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    count++;
                    if(count > target){
                        ele = arr[i];

                }
            }
        }
        }
        System.out.println("the emelent occurs more than n/2 times is:"+ele);

    }
    public static void main(String[] args){
        int[] arr = {2,0,2,1,1,2,2};
        result(arr);
    }
}