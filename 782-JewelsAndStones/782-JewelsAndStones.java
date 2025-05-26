// Last updated: 5/27/2025, 12:46:12 AM
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        
        // Method 1
//         int count = 0;
        
//         for(int i=0 ; i<stones.length() ; i++){
//             String str = String.valueOf(stones.charAt(i));
//             if(jewels.contains(str)){
//                 count++;
//             }
//         }
        
//         return count;
        
        // Method 2
        return stones.replaceAll("[^" + jewels + "]", "").length();
        
    }
}