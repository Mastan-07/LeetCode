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
    TreeNode helper(int [] arr,int lo,int hi){
        if(lo>hi) return null;//base case when low>high it means we have traversed the whole array
        int mid=(lo+hi)/2;
        TreeNode root=new TreeNode(arr[mid]);//creating a new node root
        root.left=helper(arr,lo,mid-1);//joining the left subtree to root
        root.right=helper(arr,mid+1,hi);//joining the right subtree to root
        return root;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums,0,nums.length-1);
    }
}