package abhisekTest;
import java.util.*;
import java.lang.*;
import java.util.Arrays;
import java.util.LinkedList;
import abhisekTest.Employee;


//Path Sum Problem solved using dfs

	
class Tree {
	    
	   Node root;
	   
	   public Tree(Node root) {
		   this.root = root;
	   }
    
	   private void recurseTree(Node node, int remainingSum, List<Integer> pathNodes,List<List<Integer>> pathsList) {
	        
	        if (node == null) {
	            return;
	        }
	        
	        // Add the current node to the path's list
	        pathNodes.add(node.nodeData);
	        
	        // Check if the current node is a leaf and also, if it
	        // equals our remaining sum. If it does, we add the path to
	        // our list of paths
	        if (remainingSum == node.nodeData && node.left == null && node.right == null) {
	            pathsList.add(new ArrayList<>(pathNodes));
	        } else {
	            
	            // Else, we will recurse on the left and the right children
	            this.recurseTree(node.left, remainingSum - node.nodeData, pathNodes, pathsList);
	            this.recurseTree(node.right, remainingSum - node.nodeData, pathNodes, pathsList);
	        }
	        
	        // We need to pop the node once we are done processing ALL of it's
	        // subtrees.
	        System.out.println(pathNodes);
	        //Didnot uderstand 
	        pathNodes.remove(pathNodes.size() - 1);
	        
	        
	    }
	    
	    public List<List<Integer>> pathSum(Node root, int sum) {
	        List<List<Integer>> pathsList = new ArrayList<List<Integer>>();
	        List<Integer> pathNodes = new ArrayList<Integer>();
	    	this.recurseTree(root, sum, pathNodes, pathsList);
	    	System.out.println(pathsList);
	        return pathsList;        
	    }
	    
	    public static void main(String args[])  
	    { 
	        /* creating a binary tree and entering  
	         the nodes */
	        
	        
	        
	        // Tree root = new Tree(1,new Tree(2,new Node(6),new Node (7)),new Tree(8,new Node(9),new Node(10)));
	         
	          
	          Node L1 = new Node(2,new Node(5),new Node(7));
	          Node L2 = new Node(3,new Node(8),new Node(9));
	          Node root = new Node(1,L1,L2);
	          Tree tree = new Tree(root);
	      
	         
	        tree.pathSum(root,22); 
	    }






	}


	
		


