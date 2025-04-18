class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) { // Start from i + 1 to avoid duplicate checks
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j}; // Return the first valid pair
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution found");
    }
}
