import java.util.ArrayList;
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


class Level_Order_Average  {

    public List<Double> averageOfLevels(TreeNode root) {
        
        List<Double> result = new ArrayList<>();

        Queue <TreeNode> q = new LinkedList<>();
        
        q.add(root);

        while(!q.isEmpty()){
            
            
            double avg = 0;
            int rowSize = 0;

            //Each number in row to Average
            int sizeOfQueue = q.size();

            for(int i=0; i<sizeOfQueue; i++){
                
                TreeNode temp = q.poll();
                
                avg += temp.val;
                rowSize+=1;

                if(temp.left != null){
                    q.add(temp.left);
                }
                
                if(temp.right != null){
                    q.add(temp.right);
                }
                
            }

           
            result.add(avg/rowSize);


        }
        return result;
        
    }
}