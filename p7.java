/*
A set of computers connected with each other and formed a network with the 
following rule, one computer can directly connected with atmost two computers only.
Each computer is assigned with an ID, the computer ID's may be repeated.

You are given the entire network as a tree.
Your task is to transform the network into a single row of computers,
The transformin process follows the below order:
    - For transformation, use the same network tree structure.
    - The transformation should be done in the pre-order format of the tree.
    - In the network tree, the right computer points to the next computer 
      and the left computer connected to no computer.
    
Implement the class Solution:
   1. public void transform(Node root) : transform the tree.

NOTE: in the input tree, consider -1 as 'No Connection'.


Input Format:
-------------
Single line of space separated integers, network ID's in the form the tree.

Output Format:
--------------
Print a string, as described in sample.


Sample Input-1:
---------------
1 2 3 4 5 6 7

Sample Output-1:
----------------
1 2 4 5 3 6 7

Explanation:
------------
Look at the hint for unerstanding
*/

/*
//TreeNode Structure for Your Reference..

class Node{
	public int data; 
	public Node left, right; 
	public Node(int data){
		this.data = data; 
		left = null; 
		right = null; 
	}
}

*/

import java.util.*;

// class Solution {
//     List<Integer> preOrder = new ArrayList<>();
//     int idx = 0;
    
//     private void getPreOrder(Node root){
//         if(root == null) return;
//         preOrder.add(root.data);
//         getPreOrder(root.left);
//         getPreOrder(root.right);
//     }
    
//     private void helper(Node root){
//         if(root == null) return ;
//         root.data = preOrder.get(idx++); // update the root value with preOrder array values
//         helper(root.left);
//         helper(root.right);
//     }
    
//     public void transform(Node root) {
//         if(root == null) return;
        
//         getPreOrder(root);
//         idx = 0; // Reset idx before calling helper
//         helper(root);
        
//         for(int n : preOrder) {
//             System.out.print(n + " ");
//         }
//     }
// }
class Node{
	public int data; 
	public Node left, right; 
	public Node(int data){
		this.data = data; 
		left = null; 
		right = null; 
	}
}
class Solution{
    Node temp = null;
    public void transform(Node root){
        if(root == null) return;
        transform(root.right);
        transform(root.left);
        root.right = temp;
        root.left = null;
        temp  = root;
        
    }
}
