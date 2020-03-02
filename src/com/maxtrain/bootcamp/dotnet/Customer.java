package com.maxtrain.bootcamp.dotnet;

public class Customer {

	private int _id;
	public int getId() {return _id;}
	public void setId(int id) {_id = id;}
	
	private String _name;
	public String getName() {
		return _name;
	}
	public void setName(String name) {
		_name = name;
	}
	
	private boolean _isNationalAcct;
	public boolean getNationalAcct() {
		return _isNationalAcct;
	}
	public void setNationalAcct(boolean isNationalAcct) {
		_isNationalAcct = isNationalAcct;
	}
	
	private double _sales;
	public double getSales() {
		return _sales;
	}
	public void setSales(double sales) {
		_sales = sales;
	}

	private static int _nextId = 1;
	
	public Customer(String name, boolean nationalAcct, double sales) {
		this.setId(_nextId++);
		this.setName(name);
		this.setNationalAcct(nationalAcct);
		this.setSales(sales);
	}
	public Customer(String name, boolean nationalAcct) {
		this(name, nationalAcct, 0);
	}
	public Customer(String name) {
		this(name, false);
	}
	public Customer(){
	this(null);
	}
	
	public void addSales(double amount) throws ArithmeticException { //must declare that the method might throw an Exception
		if(amount <= 0) {
			throw new ArithmeticException("Cannot add zero sales");
		}
		setSales(getSales() + amount);
	}
}
