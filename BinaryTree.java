public class BinaryTree{


	Node root;

	public BinaryTree()
	{
		root = null;
	}

	public BinaryTree(int k)
	{
		root = new Node(k);
	}


	public static class Node{

		int value;
		Node parent;
		Node left;
		Node right;

		public Node(int k)
		{
			this.value = k;
			left = null;
			right = null;
			parent = null;

		}
	}

	public Node Insert(Node root, int k)
	{
		if(root==null)
		{

			root = new Node(k);
			return root;	
		}

		else if(k>root.value)
		{
			root.right = Insert(root.right,k);
			root.right.parent = root;
		}
		else if(k<root.value)
		{
			root.left = Insert(root.left,k);
			root.left.parent = root;
		}

		return root;
	}

	public void printInOrder(Node root)
	{
		if (root != null) {
            printInOrder(root.left);
            System.out.println(root.value);
            printInOrder(root.right);
        }
	}

	public Node treeSearch(Node root,int key)
	{
		if(root == null)
		{
			return null;
		}
		if(root.value == key)
		{
			return root;
		}
		if(root.value>key)
		{
			return treeSearch(root.left, key);
		}
		else
		return treeSearch(root.right, key);
	}

	public Node minTree(Node root)
	{
		while(root.left!=null)
		{
			root = root.left;
		}
		return root;
	}
	public Node MaxTree(Node root)
	{
		while(root.right!=null)
		{
			root = root.right;
		}
		return root;
	}

	public Node Successor(Node root,int k)
	{
		Node n = treeSearch(root, k);


		if(n!=null)

		{
		
		if(n.right != null)
		{
			return minTree(n.right);
		}
		
		else
			{
			Node p = n.parent;
			
			
			while(p!=null && n == p.right)
			{
				n = p;
				p = n.parent;
			}

			return p;

			
			}
		}

		return null;
		
}

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree(16);
		tree.Insert(tree.root, 5);
		tree.Insert(tree.root, 18);
		 tree.Insert(tree.root, 2);
		 tree.Insert(tree.root, 15);
		tree.Insert(tree.root, 17);
		tree.Insert(tree.root, 19);
		tree.Insert(tree.root, 1);
		tree.Insert(tree.root, 3);
		tree.Insert(tree.root, 13);
		tree.Insert(tree.root, 12);
		tree.Insert(tree.root, 14);


		System.out.println("Inorder Printing");


		tree.printInOrder(tree.root);


		for (int i = 1; i <= 20; i++) {
            Node node = tree.treeSearch(tree.root, i);
            if (node != null) {
                System.out.print("True for "+i);
                if (node.parent != null) {
                    System.out.println(" - Parent -> " + node.parent.value);
                }
                else{
                    System.out.println("- Root");
                }
            }
            else {
                System.out.println("False for "+i);
            }
        }


		for (int i = 1; i <= 20; i++) {
            Node node = tree.Successor(tree.root, i);
            if (node != null) {
                System.out.println("Successor of "+ i + " is " + node.value);
            }
            else {
                System.out.println("Value Not in Binary tree");
            }
        }



	}
	
}