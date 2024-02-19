class solution{
    public static int result(int[] arr,int target){
        int r = arr.length; 
        int l = 0;
        int ans = -1;
        while(l<r){
            int mid = (l+r)/2;
            if(arr[mid] >= target){
                ans = mid;
                r = mid-1;
            }else {
                l = mid+1;

            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,7, 8,9,10};
        int x = 6;
        int ind = result(arr, x);
        System.out.println("The index is: " + ind);
    }
}