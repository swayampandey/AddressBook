package com.bridgelabz;
import java.util.Scanner;
import java.util.ArrayList;

public class AddressBookMain {
	
	static Scanner sc = new Scanner(System.in);
	static ArrayList<Contact> contactList = new ArrayList<>();
	
	public void addContact() {
		
		System.out.println("Plase Enter No of Persons You Want To Add in your Address Book");
		int numOfPersons = sc.nextInt();
		for (int i=0;i<numOfPersons;i++) {
			Contact contact = new Contact();
				
			System.out.println("Enter a first name:");
			contact.setFirst(sc.next());

			System.out.println("Enter a last name:");
			contact.setLast(sc.next());

			System.out.println("Enter a Address:");
			contact.setAddress(sc.next());

			System.out.println("Enter a City name:");
			contact.setCity(sc.next());

			System.out.println("Enter a state:");
			contact.setState(sc.next());

			System.out.println("Enter a zip code:");
			contact.setZip(sc.nextLong());

			System.out.println("Enter a phone number:");
			contact.setPhoneNum(sc.nextLong());
			System.out.println("-------------------------------");
			contactList.add(contact);
		}
			System.out.print(contactList);
			
	
	}
	
	public void display() {
		System.out.println(" Welcome to Address Book Program\n ");
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		AddressBookMain addressBook = new AddressBookMain();
		addressBook.display();
		addressBook.addContact();
	}

}
