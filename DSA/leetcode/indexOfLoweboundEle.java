
public class indexOfLoweboundEle{
    
    // Function to find floor of x
    // arr: input array
    // n is the size of array
    static int findFloor(long arr[], int n, long x)
    {
        int left = 0, right = n - 1, ans = -1;
        while(left <= right){
            int mid = (left + right) / 2;
            if(arr[mid] == x){
                return mid;
            }
            if(arr[mid] < x){
                ans = mid;
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return ans;
    }
    
}
