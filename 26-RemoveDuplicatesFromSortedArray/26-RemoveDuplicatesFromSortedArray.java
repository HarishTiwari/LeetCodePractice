// Last updated: 5/27/2025, 12:47:20 AM
class Solution {
    public int removeDuplicates(int[] nums) {
        
        if(nums.length==0){
            return 0;
        }
        
        int first = 0;
        int last = 0;
        
        for(int i=0 ; i<nums.length ; i++){
            if(nums[first] != nums[last]){
                last++;
                nums[last] = nums[first];
            }
            first++;
        }
        
        return last + 1;
    }
}