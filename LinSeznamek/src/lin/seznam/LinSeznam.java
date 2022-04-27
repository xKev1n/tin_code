package lin.seznam;

public class LinSeznam {
	private Node first;
	private Node last;
	
	public LinSeznam(Node first)
	{
		this.setFirst(first);
	}
	
	public LinSeznam()
	{
		
	}
	
	public Node getFirst() {
		return first;
	}

	public void setFirst(Node first) {
		this.first = first;
	}
	
	public void addFirst(int i)
	{
		Node novy = new Node(i);
		
		if (this.isEmpty())
		{
			this.setFirst(novy);
			this.setLast(novy);
			return;
		}
		
		novy.setNext(this.getFirst());
		this.first.setPrevious(novy);
		this.setFirst(novy);
	}
	
	public void delFirst()
	{
		this.first = this.first.getNext();
		this.first.setPrevious(null);
	}
	
	public boolean isEmpty()
	{
		return (this.getFirst()==null);
	}
	
	public void addLast(int i)
	{
		Node novy = new Node(i);
		
		if (this.isEmpty())
		{
			this.setFirst(novy);
			this.setLast(novy);
			return;
		}
		
		
		this.last.setNext(novy);
		novy.setPrevious(this.last);
		this.setLast(novy);
	}
	
	public void delLast()
	{
		this.last = this.last.getPrevious();
		this.last.setNext(null);
	}
	
	public boolean contains(int i)
	{
		Node tmp = this.getFirst();
		
		while (tmp != null)
		{
			if (tmp.getData() == i)
			{
				return true;
			}
			tmp = tmp.getNext();
		}
		return false;
	}
	
	public void printAll()
	{
		Node temp = this.getFirst();
		
		while (temp!=null)
		{
			System.out.println(temp);
			temp = temp.getNext();
		}
	}
	
	public int getSize()
	{
		Node temp = this.getFirst();
		int counter = 0;
		while (temp!=null)
		{
			counter++;
			temp = temp.getNext();
		}
		return counter;
	}

	public Node getLast() {
		return last;
	}

	public void setLast(Node last) {
		this.last = last;
	}
}
