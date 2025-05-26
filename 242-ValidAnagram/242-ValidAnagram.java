// Last updated: 5/27/2025, 12:46:29 AM
class Solution {
    public boolean isAnagram(String s, String t) {
        
        // Checking whether the strings are equal or not
        
        if(s.length() != t.length()) return false;
        
        int alphabet[] = new int[26];
        
        for(int i=0 ; i < s.length() ; i++){
            alphabet[s.charAt(i) - 'a']++;
            alphabet[t.charAt(i) - 'a']--;
        }
        
        // looping on alphabet
        
        for(int i : alphabet){
            if(i!=0) return false;
        }
        return true;
    }
}