package feec.grafiky;

import java.util.HashMap;
import java.util.HashSet;

public class Node {
	private HashSet<Node> neighbors;
	private HashMap<String, Integer> vahy;
	private String nazev;

	
	
	public Node(String nazev)
	{
		neighbors = new HashSet<Node>();
		vahy = new HashMap<String,Integer>();
		this.nazev=nazev;
	}

	public String getNazev() {
		return nazev;
	}

	public void setNazev(String nazev) {
		this.nazev = nazev;
	}
	
	public void addNeighbor(Node n, int cost)
	{
		neighbors.add(n);
		vahy.put(n.getNazev(),cost);
	}
	
	public Integer getCost(String dest)
	{
		return this.vahy.get(dest);
	}

}
