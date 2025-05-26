// Last updated: 5/27/2025, 12:45:56 AM
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> result = new ArrayList<>();
        
        int greatestCandyOwner = 0;
        
        for(int i=0 ; i<candies.length ; i++){
            if(greatestCandyOwner < candies[i]){
                greatestCandyOwner = candies[i];
            }
        }
        
        for(int i=0 ; i<candies.length ; i++){
            int kidWithExtraCandies = candies[i] + extraCandies;
            
            if(kidWithExtraCandies >= greatestCandyOwner){
                result.add(true);
            }else{
                result.add(false);
            }
        }
        
        return result;
    }
}