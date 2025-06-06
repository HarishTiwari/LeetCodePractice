// Last updated: 5/27/2025, 12:46:00 AM
class Solution {
    public int[] replaceElements(int[] arr) {

        int rightMax = -1;

        for(int i = arr.length - 1 ; i >=0 ; i--){
            int newMax = Math.max(rightMax,arr[i]);
            arr[i] = rightMax;
            rightMax = newMax;
        }

        return arr;
    }
}