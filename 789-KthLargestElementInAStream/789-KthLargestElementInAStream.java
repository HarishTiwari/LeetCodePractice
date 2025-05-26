// Last updated: 5/27/2025, 12:46:11 AM
class KthLargest {

    private int k;
    private PriorityQueue<Integer> pq;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        pq = new PriorityQueue<Integer>(); // min heap

        for(int x : nums){
            add(x);
        }
    }
    
    public int add(int val) {

        pq.add(val);

        if(pq.size() > k){
            pq.remove();
        }
        
        return pq.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */