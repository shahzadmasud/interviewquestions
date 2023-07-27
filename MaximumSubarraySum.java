public class MaximumSubarraySum {

    public static int maxSubarraySum(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            // Calculate the maximum subarray sum ending at index i
            currentSum = Math.max(nums[i], currentSum + nums[i]);

            // Update the overall maximum subarray sum
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] nums2 = {1, 2, 3, -2, 5};
        int[] nums3 = {-1, -2, -3, -4};

        System.out.println(maxSubarraySum(nums1)); // Output: 6
        System.out.println(maxSubarraySum(nums2)); // Output: 9
        System.out.println(maxSubarraySum(nums3)); // Output: -1
    }
}
