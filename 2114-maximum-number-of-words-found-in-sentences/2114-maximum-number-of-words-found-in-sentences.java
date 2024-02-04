class Solution {
    public int mostWordsFound(String[] sentences) {
        
        int maxWord = 0;
        
        for(int i=0 ; i<sentences.length ; i++){
            String[] wordsInSentence = sentences[i].split(" ");
            int wordCount = wordsInSentence.length;
            if(maxWord < wordCount){
                maxWord = wordCount;
            }
        }
        
        return maxWord;
    }
}