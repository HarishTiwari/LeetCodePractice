// Last updated: 5/27/2025, 12:46:30 AM
class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int n = nums.length;
        int[] ans = new int[n];

        int leftProd = 1;
        int rightProd = 1;

        ans[0] = leftProd;
        for(int i = 1 ; i < n ; i++){
            leftProd *= nums[i-1];
            ans[i] = leftProd;
        }

        for(int i = n-1 ; i>= 0 ; i--){
            ans[i] *= rightProd;
            rightProd *= nums[i];
            
        }

        return ans;
    }
}