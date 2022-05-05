package com.bl.addressbook.sql;

	import java.util.HashSet;
	import java.util.Scanner;
	import java.util.Set;

	public class AddressBook implements IAddressBook {

		Set<Contact> contacts;

		public AddressBook() {
			contacts = new HashSet<>();
		}

		@Override
		public void addContact(Scanner sc) {
			Contact contact = new Contact();

			System.out.println("Enter the first name : ");
			contact.setFirstName(sc.nextLine());

			System.out.println("Enter the last name : ");
			contact.setLastName(sc.nextLine());

			System.out.println("Enter the address : ");
			contact.setAddress(sc.nextLine());

			System.out.println("Enter the city : ");
			contact.setCity(sc.nextLine());

			System.out.println("Enter the email : ");
			contact.setEmail(sc.nextLine());

			System.out.println("Enter the state : ");
			contact.setState(sc.nextLine());

			System.out.println("Enter the zipcode : ");
			contact.setZip(sc.nextLong());

			System.out.println("Enter the phone number : ");
			contact.setPhoneNo(sc.nextLong());
			contacts.add(contact);
		}

		@Override
		public void editContact(Scanner sc) {
			System.out.println(contacts);

			System.out.println(
					"Enter the first name which contact you want to edit.");
			String firstName = sc.nextLine();

			boolean isContactFound = contacts.stream().anyMatch(
					c -> c.getFirstName().equals(firstName));

			if (isContactFound) {
				Contact contact = contacts.stream().filter(
						c -> c.getFirstName().equals(firstName))
						.findFirst().get();

				System.out.println("Enter the first name : ");
				contact.setFirstName(sc.nextLine());

				System.out.println("Enter the last name : ");
				contact.setLastName(sc.nextLine());

				System.out.println("Enter the address : ");
				contact.setAddress(sc.nextLine());

				System.out.println("Enter the city : ");
				contact.setCity(sc.nextLine());

				System.out.println("Enter the email : ");
				contact.setEmail(sc.nextLine());

				System.out.println("Enter the state : ");
				contact.setState(sc.nextLine());

				System.out.println("Enter the zipcode : ");
				contact.setZip(sc.nextLong());

				System.out.println("Enter the phone number : ");
				contact.setPhoneNo(sc.nextLong());

			} else {
				System.out.println("No Contact found..");
			}
		}

		@Override
		public void deleteContact(Scanner sc) {
			System.out.println(contacts);

			System.out.println(
					"Enter the first name which contact you want to delete.");
			String firstName = sc.nextLine();

			boolean isContactFound = contacts.stream().anyMatch(
					c -> c.getFirstName().equals(firstName));

			if (isContactFound) {
				Contact contact = contacts.stream().filter(
						c -> c.getFirstName().equals(firstName))
						.findFirst().get();

				contacts.remove(contact);

			} else {
				System.out.println("No Contact found..");
			}
		}

		@Override
		public void showContacts() {
			System.out.println(
					"--------------------------------");
			if (contacts.isEmpty()) {
				System.out.println("No records found");
			} else {
				contacts.forEach(c -> {
					System.out.println("[firstName="
							+ c.firstName + ", lastName="
							+ c.lastName + ", address="
							+ c.address + ", city=" + c.city
							+ ", state=" + c.state + ", zip="
							+ c.zip + ", phoneNo=" + c.phoneNo
							+ ", email=" + c.email + "]");
				});
			}
			System.out.println(
					"--------------------------------");
		}
	}


