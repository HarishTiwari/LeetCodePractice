// Last updated: 6/2/2025, 9:26:22 PM
class Solution {
    public int trap(int[] height) {

        int n = height.length;

        // left max Height

        int[] leftMax = new int[n];
        leftMax[0] = height[0];
        
        for(int i=1 ; i<height.length ; i++){
            leftMax[i] = Math.max(leftMax[i-1],height[i]);
        }

        // right max height

        int[] rightMax = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i = n-2 ; i>=0 ;i--){
            rightMax[i] = Math.max(rightMax[i+1] , height[i]);
        }

        // water hold by each unit
        int count = 0;
        for(int i=0 ; i < n ; i++){
            count += Math.min(leftMax[i],rightMax[i]) - height[i];
        }

        return count;
        
    }
}