package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	private static Scanner scanner = new Scanner(System.in);
	private static GroceryList groceryList = new GroceryList();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean quit = false;
		int choice = 0;
		while(!quit){
			System.out.println("Enter your choice: ");
			choice = scanner.nextInt();
			scanner.nextLine();
			
			switch (choice) {
			case 0:
				printInstructions();
				break;
			case 1:
				groceryList.printGroceryList();
				break;
			case 2:
				addItem();
				break;
			case 3:
				modifyItem();
				break;
			case 4:
				removeItem();
				break;
			case 5:
				searchForItem();
				break;
			case 6:
				processArrayList();
				break;
			case 7:
				quit = true;
				break;
			}
		}
	}
	
	public static void printInstructions(){
		System.out.println("\nPress ");
		System.out.println("\t 0 - To print choice options");
		System.out.println("\t 1 - To print the lists of grocery item");
		System.out.println("\t 2 - To add item to grocery");
		System.out.println("\t 3 - To modify item in grocery");
		System.out.println("\t 4 - To remove item in grocery");
		System.out.println("\t 5 - To search item in grocery");
		System.out.println("\t 6 - To process the grocery list");
		System.out.println("\t 7 - To quit");
	}
	
	public static void addItem() {
		System.out.println("Please enter the grocery item: ");
		groceryList.addGroceryItem(scanner.nextLine());
	}
	
	public static void modifyItem() {
		System.out.println("Please enter the item: ");
		String itemNo = scanner.nextLine();
		System.out.println("Enter replacement item: ");
		String newItem = scanner.nextLine();
		groceryList.modifyGroceryItem(itemNo, newItem);
	}
	
	public static void removeItem() {
		System.out.println("Please enter the item: ");
		String itemNo = scanner.nextLine();
		groceryList.removeGroceryItem(itemNo);
	}
	
	public static void searchForItem() {
		System.out.println("Item to search for: ");
		String searchItem = scanner.nextLine();
		if(groceryList.onFile(searchItem)) {
			System.out.println("Found " +searchItem + "in grocery" );
		} else {
			System.out.println(searchItem + " is not in the grocery");
		}
	}
	
	public static void processArrayList() {
//		ArrayList<String> newArray = new ArrayList<String>();
//		newArray.addAll(groceryList.getGroceryList());
		
		ArrayList<String> newArray = new ArrayList<String>(groceryList.getGroceryList());
		
		String[] myArray = new String[groceryList.getGroceryList().size()];
		myArray = groceryList.getGroceryList().toArray(myArray);
		
	}

}
