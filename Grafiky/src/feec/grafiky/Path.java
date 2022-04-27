package feec.grafiky;

import java.util.HashSet;

public class Path {
	private HashSet<String> cesta;
	private String start;
	private Graph g;
	private int cena = 0;
	
	public Path(Graph g, String start)
	{
		cesta = new HashSet<String>();
		this.start = start;
		this.g = g;
	}
	
	public void addVrchol(String name)
	{
		cena += g.getUzel(start).getCost(name);
		cesta.add(name);
		start = name;
	}
	
	public int getCena() {
		return cena;
	}
	
}
