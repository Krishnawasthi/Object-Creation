package com.sbi.user1;

public class Account extends Object {
	
	private String name;
	private int balance;
	

	Account(){
		
		//1st line of the constructor
	this("ram", 1000);
	//  this is used to call same class (Account) constructor  
		
	}
	
	Account(String _name, int _balance){
		//1st line of the constructor
		super();  //calling the super class(Object with no argument constructor
		this.name = _name;
		this.balance = _balance;
		
	}
     Account( int _balance, String _name){
		
		
		
		this.name = _name;
		this.balance = _balance;
	}
	
}
