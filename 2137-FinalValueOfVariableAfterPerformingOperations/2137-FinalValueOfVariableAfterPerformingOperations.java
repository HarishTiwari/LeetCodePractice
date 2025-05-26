// Last updated: 5/27/2025, 12:45:40 AM
class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int count = 0;
        
        for(int i=0 ; i<operations.length;i++){
            if(operations[i].contains("--X") || operations[i].contains("X--")){
                count--;
            }else if(operations[i].contains("X++") || operations[i].contains("++X")){
                count++;
            }
        }
        
        return count;
    }
}