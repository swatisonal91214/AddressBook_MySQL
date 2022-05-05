package com.bl.addressbook.sql;

import java.util.Scanner;

public interface IAddressBook {

	void addContact(Scanner sc);
	
	void showContacts();

	void editContact(Scanner sc);

	void deleteContact(Scanner sc);
}