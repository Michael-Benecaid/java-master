package abstraction;

import javax.swing.OverlayLayout;

public class MyLinkedList implements NodeList{
	private ListItem  root = null;
	
	public MyLinkedList(ListItem root) {
		this.root = root;
	}

	@Override
	public ListItem getRoot() {
		// TODO Auto-generated method stub
		return this.root;
	}

	@Override
	public boolean addItem(ListItem newItem) {
		// TODO Auto-generated method stub
		if(this.root == null) {
			this.root = newItem;
			return true;
		}
		
		ListItem currentItem = this.root;
		while(currentItem != null) {
			int comparison = (currentItem.compareTo(newItem));
			if(comparison < 0) {
				if(currentItem.next() != null) {
					currentItem = currentItem.next();
				} else {
					currentItem.setNext(newItem).setPrevious(currentItem);
					return true;
				}
			} else if (comparison> 0){
				if(currentItem.previous() != null) {
					currentItem.previous().setNext(newItem).setPrevious(currentItem.previous());
					newItem.setNext(currentItem).setPrevious(newItem);
				} else {
					newItem.setNext(this.root).setPrevious(newItem);
					this.root = newItem;
				}
				return true;
			} else {
				System.out.println(newItem.getValue() + " is already in the list");
				return false;
			}
		}
		return false;
	}

	@Override
	public boolean removeItem(ListItem item) {
		// TODO Auto-generated method stub
		if(item == null) {
			System.out.println("Deleting item " + item.getValue());
		}
		ListItem currentItem = this.root;
		while(currentItem != null) {
			int comparison= currentItem.compareTo(item);
			if(comparison == 0){
				if(currentItem == this.root){
					this.root= currentItem.next();
				} else {
					currentItem.previous().setNext(currentItem.next());
					if(currentItem.next() != null){
						currentItem.next().setPrevious(currentItem.previous());
					}
				}
				return true;
			} else if (comparison < 0) {
				currentItem = currentItem.next();
			} else {
				return false;
			}
		}
		return false;
	}

	@Override
	public void tranverse(ListItem root) {
		// TODO Auto-generated method stub
		if(root == null) {
			System.out.println("The list is empty");
		}
		while(root != null) {
			System.out.println(root.getValue());
			root = root.next();
		}
	}
}
