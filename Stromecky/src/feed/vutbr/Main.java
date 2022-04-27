package feed.vutbr;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinTree bt = new BinTree();
		
		bt.insert(7);
		bt.insert(5);
		bt.insert(20);
		bt.insert(1);
		bt.insert(6);
		bt.insert(8);
		
		
		bt.in_order(bt.getRoot());
		System.out.println("Soucet vsech je: "+bt.getSum());
		
		
		bt.getLeaves(bt.getRoot());
		
		bt.getIntNodes(bt.getRoot());
		
		System.out.println("The sum of leaves is: "+bt.getSumOfLeaves());
		System.out.println("The sum of internal nodes is: "+bt.getSumOfIntNodes());
		
		System.out.println("Obsahuje 0? "+bt.containts(0));
		System.out.println("Obsahuje 8? "+bt.containts(8));
		System.out.println("Nejhlubsi uzel: "+bt.getDeepestNode());
		
		bt.getNodesAtDepth(bt.getRoot());
	}

}
