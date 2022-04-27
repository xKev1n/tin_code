package feed.vutbr;

public class Node {
	private Node left;
	private Node right;
	
	private Node parent;
	
	private int data;
	
	
	public Node(int i)
	{
		this.setData(i);
	}
	
	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getParent() {
		return parent;
	}

	public void setParent(Node parent) {
		this.parent = parent;
	}	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Node with data: "+this.getData();
	}
}
