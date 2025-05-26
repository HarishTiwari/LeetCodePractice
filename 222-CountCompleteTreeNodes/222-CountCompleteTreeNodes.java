// Last updated: 5/27/2025, 12:46:36 AM
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
    public int countNodes(TreeNode root) {
        if(root == null) return 0;

        int leftCount = leftNodeHeight(root.left);
        int rightCount = rightNodeHeight(root.right);

        if(leftCount == rightCount)
            return ((2<<rightCount) - 1);

        return countNodes(root.left) + countNodes(root.right) + 1;
    }

    public static int leftNodeHeight(TreeNode root){
        int count = 0;
        while(root !=null){
            count++;
            root = root.left;
        }

        return count;
    }

    public static int rightNodeHeight(TreeNode root){
        int count = 0;
        while(root !=null){
            count++;
            root = root.right;
        }
        return count;
    }
}