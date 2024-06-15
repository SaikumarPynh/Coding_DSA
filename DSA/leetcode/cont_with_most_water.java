class Solution {
    public int maxArea(int[] height) {
        
        //  solving using two pointer method
        int left = 0;
        int right  = height.length -1;
        int max = 0;
        while(left < right){
            System.out.println(left+" "+right);
            int area = Math.min(height[left],height[right]) * (right - left);
            max = Math.max(area,max);
            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }
        //made some changes to the same approach 
        // int left = 0;
        // int right = height.length - 1;
        // int max = 0;
        // while(left < right){
        //     int min = Math.min(height[left],height[right]);
        //     max = Math.max(max,min * (right - left));
        //     if(height[left] < height[right]){
        //         left++;
        //     }else{
        //         right--;
        //     }
        // }
        return max;
    }
    public static void main(String[] args){
        Solution obj = new Solution();
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(obj.maxArea(height));
    }
}
