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
        List<List<Integer>> list=new ArrayList<>();
        if(root==null)return list;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int levelsize=queue.size();
            List<Integer> clist=new ArrayList<>();
            for(int i=0;i<levelsize;i++){
                TreeNode cnode=queue.poll();
                clist.add(cnode.val);
                if(cnode.left!=null)queue.offer(cnode.left);
                if(cnode.right!=null)queue.offer(cnode.right);
            }
            list.add(clist);
        }
        return list;
    }
}