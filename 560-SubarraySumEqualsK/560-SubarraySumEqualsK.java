// Last updated: 6/8/2025, 4:11:44 PM
class Solution {
    public int subarraySum(int[] arr, int k) {

        int count = 0;

        // calculate the prefix sum of array
        int[] prefixArr = calculatePrefixSum(arr);

        // calculating each subarray sum

        for(int i=0 ; i < arr.length ; i ++){
            for(int j = i ; j < arr.length ; j++){

                int sumOfSubarr = (i !=0) ? prefixArr[j] - prefixArr[i-1] : prefixArr[j]; 

                if(sumOfSubarr == k) count++;

            }
        }

        return count;
        
    }

    public int[] calculatePrefixSum(int[] arr){

        int[] prefixArr = new int[arr.length];

        prefixArr[0] = arr[0];

        for(int i=1 ; i < arr.length ; i++){
         prefixArr[i] =  prefixArr[i-1] + arr[i];  
        }

        return prefixArr;
    }

    
}