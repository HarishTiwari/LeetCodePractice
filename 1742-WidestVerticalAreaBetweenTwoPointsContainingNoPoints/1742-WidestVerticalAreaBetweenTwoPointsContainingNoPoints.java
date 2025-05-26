// Last updated: 5/27/2025, 12:45:51 AM
class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        
        // Sort the point array based on x-coordinates
        Arrays.sort(points , (a,b) -> Integer.compare(a[0],b[0]));
        
        int maxWidth = 0;
        
        // loop on the sorted array 
        for(int i=0 ; i<points.length-1 ; i++){
            
            int width = points[i+1][0] - points[i][0];
            
            if(maxWidth < width){
                maxWidth = width;
            }
        }
        
        return maxWidth;
    }
}