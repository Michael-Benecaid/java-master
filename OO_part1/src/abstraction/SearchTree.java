package abstraction;

import java.awt.List;

public class SearchTree implements NodeList{
	private ListItem root = null;
	
	public SearchTree(ListItem root) {
		// TODO Auto-generated constructor stub
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
	        if (item != null) {
	            System.out.println("Deleting item " + item.getValue());
	        }
	        ListItem currentItem = this.root;
	        ListItem parentItem = currentItem;

	        while (currentItem != null) {
	            int comparison = (currentItem.compareTo(item));
	            if (comparison < 0) {
	                parentItem = currentItem;
	                currentItem = currentItem.next();
	            } else if (comparison > 0) {
	                parentItem = currentItem;
	                currentItem = currentItem.previous();
	            } else {
	                // equal: we've found the item so remove it
	                performRemoval(currentItem, parentItem);
	                return true;
	            }
	        }
	        return false;
	    }


	    private void performRemoval(ListItem item, ListItem parent) {
	        // remove item from the tree
	        if (item.next() == null) {
	            // no right tree, so make parent point to left tree (which may be null)
	            if (parent.next() == item) {
	                // item is right child of its parent
	                parent.setNext(item.previous());
	            } else if (parent.previous() == item) {
	                // item is left child of its parent
	                parent.setPrevious(item.previous());
	            } else {
	                // parent must be item, which means we were looking at the root of the tree
	                this.root = item.previous();
	            }
	        } else if (item.previous() == null) {
	            // no left tree, so make parent point to right tree (which may be null)
	            if (parent.next() == item) {
	                // item is right child of its parent
	                parent.setNext(item.next());
	            } else if (parent.previous() == item) {
	                // item is left child of its parent
	                parent.setPrevious(item.next());
	            } else {
	                // again, we are deleting the root
	                this.root = item.next();
	            }
	        } else {
	            // neither left nor right are null, deletion is now a lot trickier!
	            // From the right sub-tree, find the smallest value (i.e., the leftmost).
	            ListItem current = item.next();
	            ListItem leftmostParent = item;
	            while (current.previous() != null) {
	                leftmostParent = current;
	                current = current.previous();
	            }
	            // Now put the smallest value into our node to be deleted
	            item.setValue(current.getValue());
	            // and delete the smallest
	            if (leftmostParent == item) {
	                // there was no leftmost node, so 'current' points to the smallest
	                // node (the one that must now be deleted).
	                item.setNext(current.next());
	            } else {
	                // set the smallest node's parent to point to
	                // the smallest node's right child (which may be null).
	                leftmostParent.setPrevious(current.next());
	            }
	        }
	    }

	@Override
	public void tranverse(ListItem root) {
		// TODO Auto-generated method stub
		if(root != null) {
			System.out.println(root.getValue());
			tranverse(root.next());
		}
	}

}