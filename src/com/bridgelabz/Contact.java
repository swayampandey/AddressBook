package com.bridgelabz;


public class Contact {
	String First, Last, Address,  City, State;
	long PhoneNum, Zip;
	public String getFirst() {
		return First;
	}
	public void setFirst(String first) {
		First = first;
	}
	public String getLast() {
		return Last;
	}
	public void setLast(String last) {
		Last = last;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public long getPhoneNum() {
		return PhoneNum;
	}
	public void setPhoneNum(long phoneNum) {
		PhoneNum = phoneNum;
	}
	public long getZip() {
		return Zip;
	}
	public void setZip(long zip) {
		Zip = zip;
	}
	@Override
	public String toString() {
		return "\n PERSON DETAILS \n firstName = " + First + " \n lastName = " + Last 
				+ "\n address = " + Address + "\n city = "
				+ City + "\n state = " + State + "\n zip Code = " + Zip 
				+ "\n phoneNo = " + PhoneNum+"\n-Successfully added "+First+" into new contacts\n";
	}
	
	

}
