public class count_unique_ele_in_sortedArray {
    public static void main(String[] args) {
        // Example usage:
        int[] nums = {1, 1, 2, 2, 3, 4, 5, 5, 5, 6}; // Example input array
        Solution solution = new Solution();
        static int uniqueCount = removeDuplicates(nums);
        System.out.println("Number of unique elements: " + uniqueCount);
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int c = 1; // Counter for unique elements
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[c] = nums[i]; // Store unique element at index c
                c++; // Increment counter for unique elements
            }
        }

        return c; // Return the count of unique elements
    }
}
