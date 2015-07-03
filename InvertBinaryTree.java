/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode invertTree(TreeNode root) {
    if(root!=null){
       invert(root);
    }
    return root;    
}
 
    public void invert(TreeNode n){
 
    TreeNode temp = n.left;
    n.left = n.right;
    n.right = temp;
 
    if(n.left!=null)
        invert(n.left);
 
    if(n.right!=null)
        invert(n.right);
        
}
        
        
    }