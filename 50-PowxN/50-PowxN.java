// Last updated: 5/27/2025, 12:47:16 AM
class Solution {
    public double myPow(double x, int n) {
        int n1 = n;
        if(n < 0)
            n1 = Math.abs(n);
        
        double ans = power(x , n1);
        
        if(n < 0 ){
            return 1 / ans;
        }

        return ans;
    }

    public double power(double a , int n){
        if(n == 0) return 1;
        if(n==1) return a;

        double halfPower = power(a,n/2);

        if(n % 2 == 0) return halfPower * halfPower;
        else return halfPower * halfPower * a;
    }
}