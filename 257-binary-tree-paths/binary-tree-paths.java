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
    public void helper(TreeNode root ,ArrayList<String> ar ,String s){
        if(root ==null) return;
        if(root.left==null && root.right==null){
            s =s+root.val;
            ar.add(s);
            return;
        }
        helper(root.left,ar,s+root.val+"->");
        helper(root.right,ar,s+root.val+"->");
    }
    public List<String> binaryTreePaths(TreeNode root) {
        ArrayList<String> ar = new ArrayList<>();
        helper(root,ar,"");
        return ar;
    }
}