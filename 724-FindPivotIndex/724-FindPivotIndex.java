// Last updated: 5/27/2025, 12:46:15 AM
class Solution {
    public int pivotIndex(int[] nums) {
        
        int totalSum = totalSumOfArray(nums);

        int leftSum = 0;
        for(int i=0 ; i < nums.length ; i++){
            int rightSum = totalSum - leftSum - nums[i];

            if(rightSum == leftSum) return i;

            leftSum += nums[i];
        }

        return -1;
    }

    public int totalSumOfArray(int[] arr){

        int sum = 0; 
        for(int x : arr){
            sum +=x;
        }

        return sum;
    }
}