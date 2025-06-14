// Last updated: 6/14/2025, 8:30:28 PM
class Solution {
    public double findMaxAverage(int[] arr, int k) {

        int sum = Integer.MIN_VALUE;

        for(int i = 0 ; i <=arr.length-k ; i++){

            int subArrSum = 0;
            for(int j = i ; j < i+k; j++){
                subArrSum += arr[j];
            }

            sum = Math.max(sum , subArrSum);
        }

        return (double) sum / k;
    }
}