/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Next_Right_Pointerer {
    public Node connect(Node root) {
        if(root == null){return null;}
       

        Node leftNode = root;


        while(leftNode.left != null){

            
           Node tempTree = leftNode;

           while(tempTree != null){

                //Retreiving the head of the Queue to check for childs
                
                
                tempTree.left.next = tempTree.right;

                if(tempTree.next != null){
                    tempTree.right.next = tempTree.next.left;
                }
                tempTree = tempTree.next;
            }
            leftNode = leftNode.left;
        }
        return root;
    }
}