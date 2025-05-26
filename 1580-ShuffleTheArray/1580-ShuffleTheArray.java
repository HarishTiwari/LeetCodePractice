// Last updated: 5/27/2025, 12:45:55 AM
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[2*n];
        int count = 0;
        
        for(int i=0 ; i < n ; i++){
            arr[count] = nums[i];
            arr[count+1] = nums[n+i];
            count+=2;
        }
        
        return arr;
    }
}