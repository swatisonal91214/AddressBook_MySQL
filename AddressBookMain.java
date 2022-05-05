package com.bl.addressbook.sql;

	import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
	import java.util.Scanner;

	public class AddressBookMain {

		static Scanner sc;

		public static void main(String[] args)
				throws IllegalArgumentException {
			System.out.println(
					"--------------Welcome to AddressBook------------");
			sc = new Scanner(System.in);
			

			HashMap<String, IAddressBook> addressBooks = new HashMap<>();

			IAddressBook familyAddressBook = new AddressBook();
			IAddressBook friendAddressBook = new AddressBook();
			IAddressBook businessAddressBook = new AddressBook();

			addressBooks.put("Family", familyAddressBook);
			addressBooks.put("Friend", friendAddressBook);
			addressBooks.put("Business", businessAddressBook);

			int userOption = 0;

			while (userOption != 5) {
				userOption = getOptions(sc);
				String inputAddressBook = "";
				if (userOption != 2) {

					sc = new Scanner(System.in);
					System.out
							.println("Select the Addressbook");
					System.out.println(
							"1. Family\n2. Friend\n3. Business");
					inputAddressBook = sc.nextLine();
				}
				try {
					IAddressBook ab = addressBooks
							.get(inputAddressBook);

					switch (userOption) {
					case 1:
						sc = new Scanner(System.in);
						ab.addContact(sc);
						break;

					case 2:
						addressBooks
								.forEach((key, addressBook) -> {
									System.out.println(
											"------------" + key
													+ "------------");
									addressBook.showContacts();
								});
						break;

					case 3:
						ab.editContact(sc);
						break;

					case 4:
						ab.deleteContact(sc);
						break;

					case 5:
						userOption = 5;
						System.out.println("---Good bye----");
						break;

					default:
						throw new IllegalArgumentException(
								"Invalid selected option");
					}
				} catch (NullPointerException e) {
					System.out.println(
							"Address book is not found with "
									+ inputAddressBook
									+ " name.");
				}

			}
			sc.close();
		}

		public static int getOptions(Scanner sc) {
			System.out.println(
					"1. Add Contact\n2. Show Contacts\n3. Edit Contact\n4. Delete Contact\n5. Exit");
			System.out.println("Select the valid option...");
			int option = sc.nextInt();
			return option;
		}

	}

