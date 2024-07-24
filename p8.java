public class p8 {
    /*
//TreeNode Structure for Your Reference..


*/
class Node{
	public int data; 
	public Node left, right; 
	public Node(int data){
		this.data = data; 
		left = null; 
		right = null; 
	}
}

class Solution {
    
    private boolean areMirrorTrees(Node leftSubTree , Node rightSubTree){
        
        if (leftSubTree == null && rightSubTree == null) return true;
        
        if ((leftSubTree == null && rightSubTree != null) ||
            (leftSubTree != null && rightSubTree == null)) return false;
       
        
        return leftSubTree.data == rightSubTree.data && 
                areMirrorTrees(leftSubTree.left,rightSubTree.right) && 
                areMirrorTrees(leftSubTree.right,rightSubTree.left) ;
                
    }
    
    public boolean isSelfMirrorTree(Node root) {
        // Implement Your Code here.
        if(root == null || (root.left==null && root.right ==null)) return true;
        
        Node left_sub_tree = root.left;
        Node right_sub_tree = root.right;
        return areMirrorTrees(left_sub_tree,right_sub_tree);
        
    }
}

}
