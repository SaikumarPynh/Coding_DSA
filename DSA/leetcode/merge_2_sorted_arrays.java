class solution{
    public static int[] result(int[] arr1,int[] arr2,int m,int n){
        int left = 0;
        int right = 0;
        int index = 0;
        int[] arr = new int[m+n];
        while(left < m && right < n){
            if(arr1[left] <= arr2[right]) arr[index++] = arr1[left++];
            else arr[index++] = arr2[right++];
            
        }
        while(left<m){
            arr[index++] = arr1[left++];
        }
        while(right < n){
            arr[index++] = arr2[right++];
        }
        return arr;
    }
    public static void main(String[] args){
        int[] arr1 = {1,3,6};
        int[] arr2 = {0,2,4,6,7};
        int m = arr1.length;
        int n = arr2.length;
        for(int i:result(arr1,arr2,m,n)){
            System.out.print(i+" ");
        }
    }
}