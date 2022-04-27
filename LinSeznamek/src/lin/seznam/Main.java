package lin.seznam;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinSeznam ls = new LinSeznam();
		
		System.out.println(ls.isEmpty());
		
		
		ls.addFirst(100);
		ls.addFirst(10);
		ls.addFirst(1);
		
		ls.printAll();
		System.out.println(ls.getSize());
		System.out.println(ls.contains(1));
		
		ls.delFirst();
		ls.printAll();
		System.out.println(ls.getSize());
		System.out.println(ls.contains(1));
		
		ls.addLast(1);
		ls.printAll();
		System.out.println(ls.getSize());
		System.out.println(ls.contains(1));
		
		ls.delLast();
		ls.printAll();
		System.out.println(ls.getSize());
		System.out.println(ls.contains(1));
	}

}
