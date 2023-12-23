class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int[] res = new int[2];
        
        HashMap<Integer,Integer> maps = new HashMap<>();
        
        for(int i=0 ; i < nums.length ; i++){
            
            if(maps.containsKey(target - nums[i])){
                res[0] = i;
                
                res[1] = maps.get(target - nums[i]);
                
            }else{
                
                maps.put(nums[i] , i);
            }
        }
        
        return res;
        
    }
}