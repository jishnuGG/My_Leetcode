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
    int pi=0;
    int pii=0;
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        TreeNode curr=new TreeNode(preorder[pi]);
        pi++;
        if(curr.val!=postorder[pii])
        {
            curr.left=constructFromPrePost(preorder,postorder);
        }
        if(curr.val!=postorder[pii])
        {
            curr.right=constructFromPrePost(preorder,postorder);
        }
        pii++;
        return curr;
    }
}