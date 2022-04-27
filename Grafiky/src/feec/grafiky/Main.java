package feec.grafiky;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph g = new Graph();
		g.pridej("1", "2", 4);
		g.pridej("1", "6", 6);	//1
		g.pridej("1", "7", 16);
	
		g.pridej("2", "1", 4);	//2
		g.pridej("2", "3", 24);
		
		g.pridej("3", "2", 24);	//3
		g.pridej("3", "6", 23);
		g.pridej("3", "5", 18);
		g.pridej("3", "4", 9);
		
		g.pridej("4", "3", 9);	//4
		g.pridej("4", "5", 11);
		g.pridej("4", "8", 7);
		
		g.pridej("5", "6", 5);	//5
		g.pridej("5", "3", 18);	//5
		g.pridej("5", "4", 11);	//5
		g.pridej("5", "8", 14);	//5
		g.pridej("5", "7", 10);	//5
		
		g.pridej("6", "1", 6);	//6
		g.pridej("6", "7", 8);	//6
		g.pridej("6", "5", 5);	//6
		g.pridej("6", "3", 23);	//6
		
		g.pridej("7", "1", 16);	//7
		g.pridej("7", "6", 8);	//7
		g.pridej("7", "5", 10);	//7
		g.pridej("7", "8", 21);	//7
		
		g.pridej("8", "7", 21);	//8
		g.pridej("8", "5", 14);	//8
		g.pridej("8", "4", 7);	//8
		
		
		Path p = new Path(g,"1");
		p.addVrchol("6");
		p.addVrchol("5");
		System.out.println(p.getCena());
	}

}
