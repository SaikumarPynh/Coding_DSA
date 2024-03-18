class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        for(int i = 0;i< height.length - 1;i++){
            for(int j = i+1;j<height.length;j++){
                if(height[i] < height[j]){
                    max = Math.max(max,height[i] * (j-i));
                    System.out.println(max);
                }else{
                    max = Math.max(max,height[j] * (j-i));
                    System.out.println(max);
                }
            }
        }
        return max;
    }
    public static void main(String[] args){
        Solution obj = new Solution();
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(obj.maxArea(height));
    }
}