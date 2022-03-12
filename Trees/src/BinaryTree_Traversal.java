class Node{
	int item;
	Node left,right;
	public Node(int key){
		item=key;
		left=right=null;
	}
}

class Tree{
	Node root;
	Tree(){
		root=null;
	}
	
	void Inorder(Node node) {
		if(node==null) {
			return;
		}
		Inorder(node.left);
		System.out.print(node.item+" -> ");
		Inorder(node.right);
	}
	
	void Postorder(Node node) {
		if(node==null) {
			return;
		}
		Postorder(node.left);
		Postorder(node.right);
		System.out.print(node.item+" -> ");
	}
	
	void Preorder(Node node) {
		if(node==null) {
			return;
		}
		System.out.print(node.item+" -> ");
		Preorder(node.right);
		Preorder(node.left);
	}
	
}
public class BinaryTree_Traversal {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree tree = new Tree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		
		
		tree.Inorder(tree.root);
		System.out.println("In Order Traversal");
		tree.Postorder(tree.root);
		System.out.println("Post Order Traversal");
		tree.Preorder(tree.root);
		System.out.println("Pre Order Traversal");
	}

}
