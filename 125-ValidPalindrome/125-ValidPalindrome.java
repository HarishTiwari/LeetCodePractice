// Last updated: 5/27/2025, 12:47:00 AM
class Solution {
    
    
    public boolean isPalindrome(String s) {
        
        if (s == null) return false;
        if (s.isEmpty()) return true;
        s = s.toLowerCase();

        int l = 0, r = s.length() - 1;
        while (l < r) {
            while (!Character.isLetterOrDigit(s.charAt(l))) {
                l++;
                if (l == r) return true;
            }
            while (!Character.isLetterOrDigit(s.charAt(r))) r--;

            if (s.charAt(l) == s.charAt(r)) {
                l++;
                r--;
            } else {
                return false;
            }
        }
        return true;
        
    }
//     public boolean isPalindrome(String s) {
        
//         if(s.length()==0 || s.length() == 1)
//             return true;
        
//         s = s.replaceAll("\\s","");
//         s = s.replaceAll("[^a-zA-Z0-9]", "");
//         s = s.toLowerCase();
//         //System.out.println(s);
        
//         String rev = reverseString(s);

//         if (s.equals(rev)) return true;
//         else return false;
        
//     }
    
//     private String reverseStringRecursion(String str) {

//         if (str.length() == 1 || str.length() == 0) {
//             return str;
//         }

//         return reverseStringRecursion(str.substring(1)) + "" + str.charAt(0);
//     }
    
//     private String reverseString(String str) {

//         String rev = "";

//         for (int i = str.length() - 1; i >= 0; i--) {
//             rev += str.charAt(i);
//         }

//         return rev;
//     }
}