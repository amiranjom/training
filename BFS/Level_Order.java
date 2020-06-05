import java.util.LinkedList;
import java.util.Queue;


class Level_Order {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        
        //Need the main ArrayList to hold the result as Expected
        List<List<Integer>> result = new ArrayList<>();
        
        //If Tree empty
        if(root==null){
        
            return result;
        
        }

        Queue<TreeNode> treeTracking = new LinkedList<>();

        treeTracking.add(root);

        while(!treeTracking.isEmpty()){

            //Array to hold each level 
            List<Integer> eachLevel = new ArrayList<>();

            
            int sizeOfQueue = treeTracking.size();

            for(int i=0; i<sizeOfQueue; i++{

                //Retreiving the head of the Queue to check for childs
                TreeNode tempTree = treeTracking.poll();
                eachLevel.add(tempTree.val);

                if(tempTree.left != null){
                    treeTracking.add(tempTree.left);
                }
                if(tempTree.right != null){
                    treeTracking.add(tempTree.right);
                }
            } 
            result.add(0,eachLevel);
        }

        return result;
    }
}