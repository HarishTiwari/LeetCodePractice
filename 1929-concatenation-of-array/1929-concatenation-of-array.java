class Solution {
    public int[] getConcatenation(int[] nums) {
        
        int lenOfArray = nums.length;
        int[] ansArray = new int[2*lenOfArray];
        
        for(int i=0 ; i<nums.length ; i++){
            ansArray[i] = nums[i];
            ansArray[i+lenOfArray] = nums[i];
        }
        
        return ansArray;
    }
}