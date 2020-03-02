package com.maxtrain.bootcamp.dotnet;

public class UsCustomer extends Customer {
	
	public UsCustomer(String name, double sales) {
		super(name, true, sales); //super = base class
	}
	public UsCustomer(String name) {
	this(name, 0);
	}
	public UsCustomer() {
		this("A US Customer");
	}
}
