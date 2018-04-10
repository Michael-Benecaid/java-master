package arraylist;

import java.security.KeyStore.PrivateKeyEntry;
import java.util.Scanner;

public class Challenge {
	
	private static Scanner scanner = new Scanner(System.in);
	private static MobilePhone mobilePhone = new MobilePhone("0039 330 4404");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean quit = false;
		startPhone();
		printActions();
		while(!quit) {
			System.out.println("\nEnter actions:");
			int action = scanner.nextInt();
			scanner.nextLine();
			switch (action) {
			case 0:
				System.out.println("\nShutting down");
				quit = true;
				break;
			case 1:
				mobilePhone.printContacts();
				break;
			case 2:
				addNewContact();
				break;
			case 3: 
				updateContact();
				break;
			case 4:
				removeContact();
				break;
			case 5:
				queryContact();
				break;
			case 6:
				printActions();
				break;
			default:
				break;
			}
		}
	}
	
	private static void addNewContact() {
		System.out.println("Enter new contact name:");
		String name = scanner.nextLine();
		System.out.println("Enter phone number:");
		String phoneNumber = scanner.nextLine();
		Contact newContact = Contact.createContact(name, phoneNumber);
		if(mobilePhone.addNewContact(newContact)) {
			System.out.println("New contact added: "+ name + ", phone = "+ phoneNumber);
		} else {
			System.out.println("Already in contact");
		}
	}
	
	private static void updateContact() {
		System.out.println("Enter existing contact name: ");
		String name = scanner.nextLine();
		Contact existingContactRecord = mobilePhone.queryContact(name);
		if(existingContactRecord == null) {
			System.out.println("Contact not found");
			return;
		}
		System.out.println("Enter new contact name:");
		String newName= scanner.nextLine();
		System.out.println("Enter new contact phone number");
		String newNumber = scanner.nextLine();
		Contact newContact = Contact.createContact(newName, newNumber);
		if(mobilePhone.updateContact(existingContactRecord, newContact)) {
			System.out.println("Successfully updated record");
		} else {
			System.out.println("Error updating record");
		}
	}
	
	private static void removeContact() {
		System.out.println("Enter existing contact name: ");
		String name = scanner.nextLine();
		Contact existingContactRecord = mobilePhone.queryContact(name);
		if(existingContactRecord == null) {
			System.out.println("Contact not found");
			return;
		}
		if(mobilePhone.removeContact(existingContactRecord)) {
			System.out.println("Succesfully deleted");
		} else {
			System.out.println("Error deleting");
		}
	}
	
	private static void queryContact() {
		System.out.println("Enter existing contact name: ");
		String name = scanner.nextLine();
		Contact existingContactRecord = mobilePhone.queryContact(name);
		if(existingContactRecord == null) {
			System.out.println("Contact not found");
			return;
		}
		System.out.println("Name: " + existingContactRecord.getName() + " phone number is " + existingContactRecord.getPhoneNumber());
		
	}

	private static void startPhone() {
		System.out.println("Starting phone...");
	}
	
	private static void printActions() {
		System.out.println("\nAvailable actions: \npress");
		System.out.println("0 - to shutdown");
		System.out.println("1 - to print contacts");
		System.out.println("2 - to add a new contact");
		System.out.println("3 - to update an existing contact");
		System.out.println("4 - to remove an existing contact");
		System.out.println("5 - to query if an existing contact exists");
		System.out.println("6 - to print a list of available actions");
		System.out.println("Choose your action: ");
	}

}
