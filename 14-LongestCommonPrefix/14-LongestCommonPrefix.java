// Last updated: 5/27/2025, 12:47:26 AM
class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int index = 0; 

        String first = strs[0];
        String last = strs[strs.length - 1];

        while(index < first.length()){
            if(first.charAt(index) == last.charAt(index)){
                index++;
            }else{
                break;
            }
        }

        if(index==0) return "";
        return first.substring(0,index);
    }
}