// Last updated: 5/27/2025, 12:46:46 AM
class Solution {
    public int majorityElement(int[] nums) {
        int threshold = nums.length / 2 ;

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int x : nums){
            if(!map.containsKey(x)){
                map.put(x,1);
            }else{
               int prevCount =  map.get(x);
               int newCount = prevCount + 1;
               map.put(x,newCount);
            }
        }

        for(HashMap.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() > threshold)
                return entry.getKey();
        }

        return -1;
    }
}