package feed.vutbr;

import java.util.HashSet;

public class BinTree {
	private Node root = null;
	private HashSet<Node> leaves;
	private HashSet<Node> int_nodes;
	
	public BinTree(Node root)
	{
		this.setRoot(root);
		leaves = new HashSet<Node>();
		int_nodes = new HashSet<Node>();
	}
	
	public BinTree()
	{
		leaves = new HashSet<Node>();
		int_nodes = new HashSet<Node>();
	}

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}
	
	public void insert(int i)
	{
		Node temp = this.getRoot();
		Node novy = new Node(i);
		
		if (temp == null)
		{
			this.setRoot(novy);
			return;
		}
		
		while(temp != null)
		{
			if(i > temp.getData())
			{
				if (temp.getRight() == null)
				{
					
					temp.setRight(novy);
					novy.setParent(temp);
					
					return;
				}
				else
				{
					temp = temp.getRight();
				}
			}
			else if(i < temp.getData())
			{
				if (temp.getLeft() == null)
				{
					
					temp.setLeft(novy);
					novy.setParent(temp);
					
					return;
				}
				else
				{
					temp = temp.getLeft();
				}
			}
			else
			{
				System.out.println("This value is already present in the tree!");
				return;
			}
		}
	}
	
	private int sum=0;
	
	public int getSum()
	{
		return sum;
	}
	
	public void in_order(Node root)
	{
		
		if(root==null)
		{
			return;
		}
		
		in_order(root.getLeft());
		System.out.println(root);
		sum += root.getData();
		in_order(root.getRight());
	}
	
	public void pre_order(Node root)
	{
		if(root==null)
		{
			return;
		}
		
		System.out.println(root);
		pre_order(root.getLeft());
		pre_order(root.getRight());
	}
	
	public void post_order(Node root)
	{
		if(root==null)
		{
			return;
		}
		
		post_order(root.getLeft());
		post_order(root.getRight());
		System.out.println(root);
	}
	
	
	
	public void getLeaves(Node root)
	{
		
		if (root == null)
		{
			return;
		}
		
		
		if(root.getLeft() == null && root.getRight() == null)
		{
			System.out.println("Leaf: "+root);
			leaves.add(root);
		}
		getLeaves(root.getLeft());
		getLeaves(root.getRight());
	}
	
	public int getSumOfLeaves()
	{
		int sum = 0;
		for (Node node : leaves) {
			sum += node.getData();
		}
		
		return sum;
	}
	
	
	public void getIntNodes(Node root)
	{
		
		if (root == null)
		{
			return;
		}
		
		if (root != this.getRoot())
		{
			if(root.getLeft() != null || root.getRight() != null)
			{
				System.out.println("Internal Node: "+root);
				int_nodes.add(root);
			}
		}
		
		getIntNodes(root.getLeft());
		getIntNodes(root.getRight());
	}
	
	public int getSumOfIntNodes()
	{
		int sum = 0;
		for (Node node : int_nodes) {
			sum += node.getData();
		}
		
		return sum;
	}
	
	public boolean containts(int i)
	{
		Node temp = this.getRoot();
		if (root == null)
		{
			System.out.println("The binary tree is empty!");
			return false;
		}
		
		while(temp != null)
		{
			if(i > temp.getData())
			{
				temp = temp.getRight();
			}
			else if (i < temp.getData())
			{
				temp = temp.getLeft();
			}
			else
			{
				return true;
			}
		}
		
		return false;
	}
	
	public Node getDeepestNode()
	{
		int last_depth = 0;
		int counter = 0;
		Node deepest = null;
		
		for (Node node : leaves) {
			Node temp = node;
			counter = 0;
			
			while (temp != null)
			{
				temp = temp.getParent();
				counter ++;
			}
			
			if (counter > last_depth)
			{
				last_depth = counter;
				deepest = node;
			}
		}
		return deepest;
	}
	
	
	public void getNodesAtDepth(Node root)
	{
		if (root == null)
		{
			return;
		}
		
		getNodesAtDepth(root.getLeft());
		
		getNodesAtDepth(root.getRight());
		
		if (root.getParent() != null)
		{
			if (root.getParent().getParent() == this.getRoot())
			{
				System.out.println(root);
			}
		}
	}
}
