class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // Handle cases where k >= n
        if (k == 0) return; // No rotation needed

        // Step 1: Copy the last k elements to a temporary array
        int[] temp = new int[k];
        for (int i = 0; i < k; i++) {
            temp[i] = nums[n - k + i];
        }

        // Step 2: Shift the first n - k elements to the right by k positions
        for (int i = n - k - 1; i >= 0; i--) {
            nums[i + k] = nums[i];
        }

        // Step 3: Copy the elements from the temporary array to the beginning
        for (int i = 0; i < k; i++) {
            nums[i] = temp[i];
        }
    }
}
