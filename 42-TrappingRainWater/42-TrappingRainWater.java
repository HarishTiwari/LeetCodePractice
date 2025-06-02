// Last updated: 6/2/2025, 9:23:37 PM
class Solution {
    public int trap(int[] height) {

        int n = height.length;

        // left max Height

        int[] leftMax = new int[n];
        int leftMaxHeight = height[0];
        
        for(int i=0 ; i<height.length ; i++){
            leftMax[i] = Math.max(leftMaxHeight,height[i]);
            leftMaxHeight = leftMax[i];
        }

        // right max height

        int[] rightMax = new int[n];
        int rightMaxHeight = height[n-1];
        for(int i = n-1 ; i>=0 ;i--){
            rightMax[i] = Math.max(rightMaxHeight , height[i]);
            rightMaxHeight = rightMax[i];
        }

        // water hold by each unit
        int count = 0;
        for(int i=0 ; i < n ; i++){
            count += Math.min(leftMax[i],rightMax[i]) - height[i];
        }

        return count;
        
    }
}