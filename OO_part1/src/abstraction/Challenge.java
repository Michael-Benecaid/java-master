package abstraction;

public class Challenge {
	public static void main(String[] args) {
		MyLinkedList list = new MyLinkedList(null);
		//list.tranverse(list.getRoot());
		String stringData = "5 7 3 9 8 2 1 0 4 6";
		
		String[] data = stringData.split(" ");
		for(String s: data) {
			//System.out.println(s);
			list.addItem(new Node(s));
		}
		
		//list.tranverse(list.getRoot());
		
		//list.removeItem(new Node("3"));
		//list.tranverse(list.getRoot());
		
		SearchTree tree = new SearchTree(null);
		tree.tranverse(tree.getRoot());
		String stringData2 = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";
		String[] data2 = stringData2.split(" ");
		for(String s: data2) {
			System.out.println(s);
			tree.addItem(new Node(s));
		}
		tree.tranverse(tree.getRoot());
	}
}
