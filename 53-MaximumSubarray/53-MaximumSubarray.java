// Last updated: 6/28/2025, 12:21:11 PM
class Solution {
    public int maxSubArray(int[] nums) {

// [-2,1,-3,4,-1,2,1,-5,4] : sum = -2 , ans = 1

        int sum = 0;
        int ans = Integer.MIN_VALUE;

        for(int i=0 ; i < nums.length ; i++){ // -3
            if(sum >= 0){ // 1 >= 0
                sum += nums[i];  // 1 -3 = -2
            }
            else{
                sum = nums[i]; // 1
            }

            ans = Math.max(sum,ans);
        }


        return ans;
    }
}