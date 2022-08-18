package com.bridgelabz;
import java.util.Scanner;

public class Contact {
	String First, Last, Address,  City, State;
	long PhoneNum, Zip;
	
	static Scanner sc = new Scanner(System.in);
	
	public void contactDetails() {
		System.out.println("Enter first name : ");
		First = sc.nextLine();
		System.out.println("Enter last name : ");
		Last = sc.nextLine();
		System.out.println("Enter address : ");
		Address = sc.nextLine();
		System.out.println("Enter city name : ");
		City = sc.nextLine();
		System.out.println("Enter state name : ");
		State = sc.next();
		System.out.println("Enter mobile number : ");
		PhoneNum = sc.nextLong();
		System.out.println("Enter zip code : ");
		Zip = sc.nextLong();
	}
	public void display() {
		System.out.println("Enter first name    : " +First);
		
		System.out.println("Enter last name     : " +Last);
		
		System.out.println("Enter address       : " +Address);
		
		System.out.println("Enter city name     : " +City);
		
		System.out.println("Enter state name    : " +State);
		
		System.out.println("Enter mobile number : " +PhoneNum);
		
		System.out.println("Enter zip code      : " +Zip);
		
	}

}
