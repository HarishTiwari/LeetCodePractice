// Last updated: 6/29/2025, 2:50:02 PM
class Solution {
    public boolean isPalindrome(String s) {

        String ans = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();

        // applying two pointer approach

        int start = 0;
        int end = ans.length()-1;

        while(start < end){
            if(ans.charAt(start) == ans.charAt(end)){
                start++;
                end--;
            }else{
                return false;
            }
        }
        return true;
    }
}