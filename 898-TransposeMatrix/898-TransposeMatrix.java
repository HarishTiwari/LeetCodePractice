// Last updated: 5/27/2025, 12:46:08 AM
class Solution {
    public int[][] transpose(int[][] matrix) {
        
        int rows = matrix.length;
        int col = matrix[0].length;

        int[][] trans = new int[col][rows];

        for(int i=0 ; i<rows;i++){
            for(int j=0; j<col; j++){
                trans[j][i] = matrix[i][j]; 
            }
        }


        return trans;
    }
}