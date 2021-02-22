package abhisekTest;


/* public class Node {
	int nodeData;
	Node right;
	Node left;
	
	public Node () {
		
	}
	
	public Node(int item) {
		nodeData = item;
	}
	
	
	public Node(int item,Node right,Node left) 
    { 
	  nodeData = item;
	  right = this.addRightNode(right);
	  left =this.addLeftNode(left);
         
    } 
	
public Node addRightNode(Node node) {
		
		right = node ;
		return right;
	}
	
	
    public Node addLeftNode(Node node) {
		
		left = node;
		return left;
	}
	

}
 */




   
   public class Node {
       int nodeData;
       Node left;
       Node right;
       Node() {}
       Node(int item) { this.nodeData = item; }
       Node(int item, Node left, Node right) {
           this.nodeData = item;
           this.left = left;
           this.right = right;
       }
   }
  