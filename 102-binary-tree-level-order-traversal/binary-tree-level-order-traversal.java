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
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<List<Integer>> wrapList = new ArrayList<List<Integer>>();
        if(root==null) return wrapList;
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            ArrayList<Integer> level = new ArrayList<>();
            for(int i =0; i<size;i++)
            {
                if(queue.peek().left!=null)
                {
                    queue.offer(queue.peek().left);
                }
                if(queue.peek().right!=null)
                {
                    queue.offer(queue.peek().right);
                }
                level.add(queue.poll().val);
            }
            wrapList.add(level);
        }
        return wrapList;
    }
}