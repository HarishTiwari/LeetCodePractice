// Last updated: 5/27/2025, 12:47:04 AM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {

       // List<Integer> list = new ArrayList<>();
        List<List<Integer>> matrix = new ArrayList<>();

        if(root == null){

            return matrix;
        }

        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);
        
        while(!queue.isEmpty()){

            int size = queue.size();
            List<Integer> level = new ArrayList<>();

            for(int i =0 ; i < size ; i++){
                
                TreeNode temp = queue.remove();
                level.add(temp.val);

                if(temp.left != null) queue.add(temp.left);
                if(temp.right != null) queue.add(temp.right);
            }

            matrix.add(level);
        }

        return matrix;
        
    }
}