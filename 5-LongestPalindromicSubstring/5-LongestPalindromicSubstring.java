// Last updated: 5/27/2025, 12:47:30 AM
class Solution {
    
    int resultStart;
    int resultLength;
    
    public String longestPalindrome(String s) {
        
        int strLength = s.length();
        
        if(strLength == 0 || strLength == 1)
            return s;
        
        for(int start = 0 ; start < s.length() -1  ; start++)
        {
            expandAroundCenter(s,start,start);
            expandAroundCenter(s,start,start+1);
        }
        
        return s.substring(resultStart , resultStart + resultLength);
        
    }
    
    public void expandAroundCenter(String s , int begin , int end)
    {
        while(begin >= 0 && end < s.length() && s.charAt(begin) == s.charAt(end))
        {
            begin--;
            end++;
        }
        
        if(resultLength < end-begin-1)
        {
            resultStart = begin + 1;
            resultLength = end - begin -1;
        }
    }
    
}