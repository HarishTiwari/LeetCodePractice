// Last updated: 5/27/2025, 12:45:54 AM
class Solution {
    public int[] runningSum(int[] nums) {
        int[] prefixSum = new int[nums.length];
        prefixSum[0] = nums[0];

        // looping on the array
        for(int i=1 ; i < nums.length ; i++){
            prefixSum[i] = prefixSum[i-1] + nums[i];
        }

        return prefixSum;
    }
}