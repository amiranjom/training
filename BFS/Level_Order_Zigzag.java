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
class Level_Order_Zigzag {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
         
        //Need the main ArrayList to hold the result as Expected
        List<List<Integer>> result = new ArrayList<>();
        
        //If Tree empty
        if(root==null){
        
            return result;
        
        }

        Queue<TreeNode> treeTracking = new LinkedList<>();

        treeTracking.add(root);
        boolean leftToRight = true;

        while(!treeTracking.isEmpty()){

            //Array to hold each level 
            List<Integer> eachLevel = new ArrayList<>();

            
            int sizeOfQueue = treeTracking.size();
            
           

            for(int i=0; i<sizeOfQueue; i++){

                //Retreiving the head of the Queue to check for childs
                TreeNode tempTree = treeTracking.poll();
                
                if(leftToRight){
                    
                    eachLevel.add(tempTree.val);
                }else{
                    eachLevel.add(0,tempTree.val);
                }
                
                
                if(tempTree.left != null){
                    treeTracking.add(tempTree.left);
                }
                
                
                
                if(tempTree.right != null){
                    treeTracking.add(tempTree.right);
                }
                
            }
            leftToRight = !leftToRight;
            result.add(eachLevel);
        }

        return result;
    }
    
}