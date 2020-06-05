import java.util.LinkedList;
import java.util.Queue;


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
class Min_Depth {
    public int minDepth(TreeNode root) {

        int minDepth;

        if(root == null) return 0;
       
        Queue<TreeNode> q = new LinkedList<>();

        q.add(root);

        while(!q.isEmpty()){
            
            int size = q.size();
            
            minDepth++;

            for(int i=0; i<size; i++){
                TreeNode temp = q.poll();
                if(temp.left == null && temp.right == null){
                    return minDepth;
                }
                if(temp.left != null){
                    q.add(temp.left);
                }
                if(temp.right != null){
                    q.add(temp.right);
                }
            }
        }

        return 0;



    }


   
}