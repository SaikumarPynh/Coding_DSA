
class findInsertPos {
    public int searchInsert(int[] nums, int target) {
       int left = 0, right = nums.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2; // Prevent overflow
            
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        // If the target is not found, left will be the insertion point
        return left;
    }
}
    