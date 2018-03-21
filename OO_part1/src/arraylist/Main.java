package arraylist;

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
				quit = true;
				break;
			}
		}
	}
	
	public static void printInstructions(){
		System.out.println("\nPress ");
		System.out.println("\t 0 - To print choice options");
		System.out.println("\t 1 - To print the lists of grocery item");
		System.out.println("\t 2 - To ");
		System.out.println("\t 3 - To print choice options");
		System.out.println("\t 4 - To print choice options");
		System.out.println("\t 5 - To print choice options");
		System.out.println("\t 6 - To print choice options");
	}

}
