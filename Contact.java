package com.bl.addressbook.sql;

public class Contact {
	
		String firstName;
		String lastName;
		String address;
		String city;
		String state;
		long zip;
		long phoneNo;
		String email;

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getState() {
			return state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public long getZip() {
			return zip;
		}

		public void setZip(long zip) {
			this.zip = zip;
		}

		public long getPhoneNo() {
			return phoneNo;
		}

		public void setPhoneNo(long phoneNo) {
			this.phoneNo = phoneNo;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		@Override
		public String toString() {
			return firstName;
		}

		@Override
		public boolean equals(Object c) {
			return this.firstName
					.equals(((Contact) c).getFirstName());
		}

		@Override
		public int hashCode() {
			return firstName.hashCode();
		}

	}


