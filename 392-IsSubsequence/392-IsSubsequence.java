// Last updated: 5/27/2025, 12:46:18 AM
class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length() == 0){
            return true;
        }

        int i = 0;
        int j = 0;

        while(i<s.length() && j < t.length()){
            if(s.charAt(i) == t.charAt(j)){
                i++;
                j++;
            }else{
                j++;
            }
        }

        if(i == s.length()){
            return true;
        }else{
            return false;
        }
    }
}