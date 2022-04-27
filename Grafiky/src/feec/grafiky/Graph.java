package feec.grafiky;

import java.util.HashMap;

public class Graph {
	private HashMap<String,Node> uzly;
	
	public Graph()
	{
		uzly = new HashMap<String,Node>();
	}
	
	public void pridej(String n1, String n2, int cost)
	{
		Node node1 = VratNeboVytvor(n1);
		Node node2 = VratNeboVytvor(n2);
		
		uzly.put(n2, node2);
		uzly.put(n1, node1);
		
		node1.addNeighbor(node2, cost);
		node2.addNeighbor(node1, cost);
	}
	
	public Node VratNeboVytvor(String nazev)
	{
		if(uzly.containsKey(nazev))
		{
			return uzly.get(nazev);
		}
		else
		{
			Node novy = new Node(nazev);
			return novy;
		}
	}
	
	public Node getUzel(String name)
	{
		return this.uzly.get(name);
	}
	
	public HashMap<String,Node> getUzly()
	{
		return this.uzly;
	}
}
