// Last updated: 5/27/2025, 12:45:43 AM
class Solution {
    public int findMiddleIndex(int[] nums) {
        int totalSum = 0;

        for(int x : nums){
            totalSum += x;
        }

        int leftSum = 0;
        for(int i=0 ; i < nums.length ; i++){
            int rightSum = totalSum - leftSum - nums[i];

            if(rightSum == leftSum) return i;
            leftSum += nums[i];
        }

        return -1;
    }

}