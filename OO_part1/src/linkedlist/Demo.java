package linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

import composition.Case;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> placesToVisit = new LinkedList<String>();
		addInOrder(placesToVisit, "Toront");
		addInOrder(placesToVisit, "Ottawa");
		addInOrder(placesToVisit, "Vancover");
		addInOrder(placesToVisit, "New York");
		addInOrder(placesToVisit, "Los Angeles");
		addInOrder(placesToVisit, "Washington");
		addInOrder(placesToVisit, "Boston");
		addInOrder(placesToVisit, "Miami");
		addInOrder(placesToVisit, "Waterloo");
		
		printList(placesToVisit);
		
		addInOrder(placesToVisit, "Atlanda");
		addInOrder(placesToVisit, "Dallas");
//		
		printList(placesToVisit);
//		placesToVisit.add(1, "Waterloo");
//		printList(placesToVisit);
//		
//		placesToVisit.remove(4);
//		printList(placesToVisit);
		
		Visit(placesToVisit);
	}
	
	private static void printList(LinkedList<String> linkedList){
		Iterator<String> i = linkedList.iterator();
		while(i.hasNext()){
			System.out.println("Now visiting "+ i.next());
		}
		System.out.println("=================");
	}
	
	private static boolean addInOrder(LinkedList<String> linkedList, String newCity){
		ListIterator<String> stringListIterator = linkedList.listIterator();
		
		while(stringListIterator.hasNext()){
			int comparison = stringListIterator.next().compareTo(newCity);
			if(comparison == 0){
				//equal do not add
				System.out.println(newCity + " is already included.");
				return false;
			} else if(comparison > 0){
				// new city should appear before this one
				stringListIterator.previous();
				stringListIterator.add(newCity);
				return true;
			} else if(comparison < 0){
				//move to next city
			}
		}
		stringListIterator.add(newCity);
		return true;
	}
	
	private static void Visit(LinkedList cities){
		Scanner scanner = new Scanner(System.in);
		boolean quit = false;
		boolean goingForward = true;
		ListIterator<String> listIterator = cities.listIterator();
		
		if(cities.isEmpty()){
			System.out.println("No cities in the itenerary");
			return ;
		} else {
			System.out.println("Now visiting" + listIterator.next());
			printMenu();
		}
		
		while(!quit){
			int action = scanner.nextInt();
			scanner.nextLine();
			switch (action) {
			case 0:
				System.out.println("Holiday over");
				quit = true;
				break;
			case 1:
				if(!goingForward){
					if(listIterator.hasNext()){
						listIterator.next();
					}
					goingForward = true;
				}
				if(listIterator.hasNext()){
					System.out.println("Now visiting "+ listIterator.next());
				} else {
					System.out.println("Reach the end of the list");
					goingForward = false;
				}
				break;
			case 2:
				if(goingForward){
					if(listIterator.hasPrevious()){
						listIterator.previous();
					}
					goingForward = false;
				}
				if(listIterator.hasPrevious()){
					System.out.println("Now visiting "+ listIterator.previous());
				} else {
					System.out.println("We are at the start of the list");
					goingForward = true;
				}
				break;
			case 3: 
				printMenu();
				break;
			}
			
		}
	}
	
	private static void printMenu(){
		System.out.println("Available acitons:");
		System.out.println("0 - quit");
		System.out.println("1 - visit next city");
		System.out.println("2 - visit previous city");
		System.out.println("3 - print menu options");
	}

}
