// Last updated: 5/27/2025, 12:47:15 AM
class Solution {
    public int lengthOfLastWord(String s) {
        String[] splitArr = s.trim().split(" ");

       return splitArr[splitArr.length-1].trim().length();
    }
}