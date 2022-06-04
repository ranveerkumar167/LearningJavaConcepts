package com.entities;

public class Dog extends Animal {
	
	private String name;
	
	public Dog(String name) {
		this.name = name;
	}
	
	public Dog() {
		
	}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Dog [name=" + name + "]";
	}


	public void bark() {
		System.out.println("Dog barks!");
	}
	
	

}
