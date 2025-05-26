// Last updated: 5/27/2025, 12:45:49 AM
class Solution {
    public int maximumWealth(int[][] accounts) {
        
        int maxWealth = 0;
        
        for(int i=0; i<accounts.length ; i++){
            int[] tempArr = accounts[i];
            
            int wealth = 0;
            
            for(int j=0 ; j<tempArr.length ; j++){
                wealth+=tempArr[j];
            }
            
            if(maxWealth < wealth){
                maxWealth = wealth;
            }
        }
        
        return maxWealth;
    }
}