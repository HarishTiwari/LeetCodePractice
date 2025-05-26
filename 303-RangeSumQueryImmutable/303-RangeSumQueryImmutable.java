// Last updated: 5/27/2025, 12:46:24 AM
class NumArray {

    int[] nums;
    int[] prefixSum;

    public NumArray(int[] nums) {

        this.nums = nums;
        this.prefixSum = new int[nums.length];

        calculatePrefixSum(nums);
        
    }

    private void calculatePrefixSum(int[] nums){
        
        this.prefixSum[0] = nums[0];

        for(int i = 1; i < nums.length ; i++){
            this.prefixSum[i] = this.prefixSum[i-1] + nums[i];
        }
    }
    
    public int sumRange(int left, int right) {
        
        if(left == 0){
            return this.prefixSum[right];
        }
        else{
            return this.prefixSum[right] - this.prefixSum[left-1];
        }
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */