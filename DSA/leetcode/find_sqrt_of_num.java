class solution{
    public static int result(int target){
        int l = 1;
        int r = n;
        int n = j;

        int mid = (l+r)/2;
        while(l<r){
        if( mid * mid == target){
            return target;
        }else if(mid * mid < target){
            l = mid+1;
        }else{
            r = mid-1;
        }
        
        }
        return -1;
    }
    public static void main(String[] args){
        int target = 
    }
}