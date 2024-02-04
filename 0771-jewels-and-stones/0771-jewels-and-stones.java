class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        
        for(int i=0 ; i<stones.length() ; i++){
            String str = String.valueOf(stones.charAt(i));
            if(jewels.contains(str)){
                count++;
            }
        }
        
        return count;
    }
}