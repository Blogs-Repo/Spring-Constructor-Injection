package com.spring.examples;

import java.beans.ConstructorProperties;

public class Person {
	private String firstName;
	private String lastName;
	private int age;
	private Address address;
	
	@ConstructorProperties({"firstName", "lastName", "age", "address"})
	public Person(String firstName, String lastName, int age, Address address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.address = address;
	}

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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
}