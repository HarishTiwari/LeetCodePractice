// Last updated: 5/27/2025, 12:46:25 AM
class MedianFinder {

    PriorityQueue<Integer> maxLeft = new PriorityQueue<>((a,b) -> b-a);
    PriorityQueue<Integer> minRight = new PriorityQueue<>();

    public MedianFinder() {
    }
    
    public void addNum(int num) {
        if(maxLeft.size() == minRight.size()){
            minRight.add(num);
            maxLeft.add(minRight.remove());
        }else{
            maxLeft.add(num);
            minRight.add(maxLeft.remove());
        }
    }
    
    public double findMedian() {
        
        if(maxLeft.size() == minRight.size()){
            return (maxLeft.peek() + minRight.peek()) / 2.0;
        }else{
            return maxLeft.peek() * 1.0;
        }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */