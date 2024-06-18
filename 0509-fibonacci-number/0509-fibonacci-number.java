class Solution {
    public int fib(int n) {
        
        if(n==0){
            return 0;
        }
        
       int first = 0;
        int second = 1;

        int count = 1;
        while(count < n){
            int third = first + second;
            count++;
            first = second;
            second = third;
        }
        return second;
        
    }
}