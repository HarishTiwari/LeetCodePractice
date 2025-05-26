// Last updated: 5/27/2025, 12:45:34 AM
class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int index = 0;
        for(String word : words){
            if(word.indexOf(x) != -1){
                ans.add(index);
            }
            index++;
        }
        
        return ans;
    }
}