// Last updated: 5/27/2025, 12:46:16 AM
class Solution {
    public int thirdMax(int[] nums) {
        
       long max = Long.MIN_VALUE, sMax = Long.MIN_VALUE, tMax = Long.MIN_VALUE;
        for (int i : nums) {
            if (i > max) {
                tMax = sMax;
                sMax = max;
                max = i;
            } else if (i > sMax && i != max) {
                tMax = sMax;
                sMax = i;
            } else if (i > tMax && i != sMax && i != max) {
                tMax = i;
            }
        }
		
		// if thirdMax was not updated, return the first Max
		
        return tMax == Long.MIN_VALUE ? (int) max : (int) tMax;
        
    }
}