// Last updated: 5/27/2025, 12:46:44 AM
class Solution {
    public void rotate(int[] nums, int k) {

        k = k % nums.length;
        
        // reversing whole array
        reverse(nums , 0 , nums.length -1);

        // reversing the first half of the array

        reverse(nums, 0 , k-1);
        // reversing the second half of array;

        reverse(nums , k , nums.length -1);
    }

    public static void reverse(int[] arr , int start , int end){

        int left = start;
        int right = end;

        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++ ;
            right--;
        }
    }
}