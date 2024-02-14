class solution{
    public static int result(int[] arr,int target){
        int low = 0;
        int high = arr.length;
        while(low < high){
            int mid = (low+high)/2;
            if(arr[mid] == target ){
                System.out.print("element found at:");
                return mid;
            }else if(arr[mid]< target){
                low = mid+1;
            }else{
                high = mid - 1;
            }
        }
        System.out.println("element not found");
        return 0;
            
        }
        public static void main(String[] args){
            int[] arr = {2,3,5,7,4,22,32};
            int target = 22;
            System.out.println(result(arr,target));
        }
    }
    