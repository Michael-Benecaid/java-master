package abstraction;

public class Node extends ListItem{
	public Node(Object value){
		super(value);
	}

	@Override
	ListItem next() {
		// TODO Auto-generated method stub
		return this.rightLink;
	}

	@Override
	ListItem setNext(ListItem item) {
		// TODO Auto-generated method stub
		this.rightLink = item;
		return this.rightLink;
	}

	@Override
	ListItem previous() {
		// TODO Auto-generated method stub
		return this.leftLink;
	}

	@Override
	ListItem setPrevious(ListItem item) {
		// TODO Auto-generated method stub
		this.leftLink = item;
		return this.leftLink;
	}

	@Override
	int compareTo(ListItem item) {
		// TODO Auto-generated method stub
		if (item != null) {
			return ((String) super.getValue()).compareTo((String) item.getValue());
		} else {
			return -1;
		}
	}
}
