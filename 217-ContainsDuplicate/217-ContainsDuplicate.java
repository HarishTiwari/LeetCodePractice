// Last updated: 5/27/2025, 12:46:37 AM
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int x : nums){
            if(map.containsKey(x)){
                return true;
            }else{
                map.put(x,1);
            }
        }
        
        return false;
    }
}