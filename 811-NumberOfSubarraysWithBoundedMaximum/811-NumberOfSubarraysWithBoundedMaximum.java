// Last updated: 6/15/2025, 11:48:54 AM
class Solution {
    public int numSubarrayBoundedMax(int[] arr, int left, int right) {

        int count = 0 ;
        int maxElementLeftIndex = 0;
        int prevValidCount = 0;

        for(int i=0 ; i < arr.length ; i++){

            if(arr[i] > right){
                count += 0;
                maxElementLeftIndex = i+1;
                prevValidCount = 0;
            }
            else if(arr[i] >= left && arr[i] <= right){
                count += i - maxElementLeftIndex + 1;
                prevValidCount = i - maxElementLeftIndex + 1;
            }
            else{
                count += prevValidCount;
            }
        }

        return count;
        
    }
}