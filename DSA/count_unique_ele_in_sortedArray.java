 class Count_unique_ele_in_sortedArray{
    public  static int  countinguniue(int[] nums){
        int c = 0;
        int[] res = new int[nums.length];
        for(int i = 0; i<nums.length;i++){
            if(i == 0){
                res[c] = nums[i];
                c++;
            }
            else{
                if(nums[i] == nums[i-1]){
                    continue;
                }
                res[c] = nums[i];
                c++;
            }
        }
        for(int v:res){
            System.out.print(v+" ");
        }
        return c;
    }
    public static  void main(String[] args) {
        int[] nums = { 0 , 0 , 1 , 1 , 2 , 3 };
        System.out.println("count is"+Count_unique_ele_in_sortedArray.countinguniue(nums));

    }
}