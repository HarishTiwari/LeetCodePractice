// Last updated: 5/27/2025, 12:45:47 AM
class Solution {
    public boolean check(int[] nums) {
       if(nums.length == 0){
           return true;
       }
        int count = 0;
        
        for(int i=0 ; i < nums.length ; i++){
            if(nums[i] > nums[(i+1) % nums.length]){
                count ++;
            }
        }
        
        if(count > 1) return false;
        
        return true;
    }
}