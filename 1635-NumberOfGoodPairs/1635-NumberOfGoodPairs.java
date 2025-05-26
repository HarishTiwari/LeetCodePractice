// Last updated: 5/27/2025, 12:45:52 AM
class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        
        int result = 0;
        for(int element : nums){
            
            int countOfEleInMap = hm.getOrDefault(element,0);
            
            result += countOfEleInMap;
            
            hm.put(element,countOfEleInMap + 1);
        }
        
        return result;
    }
}