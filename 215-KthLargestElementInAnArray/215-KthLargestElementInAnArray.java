// Last updated: 5/27/2025, 12:46:38 AM
class Solution {
    public int findKthLargest(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

		for(int i=0 ; i<k ; i++){
			pq.add(arr[i]);
		}

		for(int i=k ; i < arr.length ; i++){
			if(arr[i] > pq.peek()){
				pq.remove();
				pq.add(arr[i]);
			}
		}

		return pq.peek();
    }
}