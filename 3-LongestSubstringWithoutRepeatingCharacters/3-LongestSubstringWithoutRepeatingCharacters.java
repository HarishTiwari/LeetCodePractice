// Last updated: 5/27/2025, 12:47:32 AM
class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int len = s.length();
        int start = 0;
        int end = 0;
        int maxLength = 0;
        
        Set<Character> st = new HashSet<>();
        
        while(start< len && end < len)
        {
            if(!st.contains(s.charAt(end)))
            {
                st.add(s.charAt(end));
                end ++ ;
                
                maxLength = Math.max(maxLength,end-start);
                
            }
            else
            {
                st.remove(s.charAt(start));
                start++;  
            }
        }
        
        return maxLength;
        
    }
}