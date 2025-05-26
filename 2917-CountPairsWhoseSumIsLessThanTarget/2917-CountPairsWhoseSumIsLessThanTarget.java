// Last updated: 5/27/2025, 12:45:38 AM
class Solution {
    public int countPairs(List<Integer> nums, int target) {
        // Optimal code
        // two pointer approach
        
        // sorting the array
        Collections.sort(nums);
        
        int left = 0;
        int right = nums.size() - 1;
        int count = 0;
        
        while(left < right){
            if(nums.get(left) + nums.get(right) < target){
                
                count += right - left;
                left++;
            }else{
                right--;
            }
        }
        
        return count;
    }
}