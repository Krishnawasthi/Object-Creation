package com.sbi.user;

public class SBIUser {
	private String name;
	private String userId;
	private String pwd;
	private int salary;
	
	
	//why we creat constructor 
	// it helps us to create objects and intialize 
	//creating constructor
	SBIUser()
	{
		
		
		System.out.println("i'm inside ..... SBIUser()...");
	}
	
	SBIUser(String _name, String _userId, String _pwd, int _salary){
		System.out.println("SBIUser(String _name, String _userId, String _pwd, int salary)");
		
		this.name = _name;
		this.userId = _userId;
		this.pwd = _pwd;
	    this.salary = _salary;
		
		
	}
	
	
public static void main(String[] args)
{
	System.out.println("Main Start here...........");
//	SBIUser  sbiUser = new SBIUser(); //calling no construtor of sbiuser class
	
	SBIUser  krishna = new SBIUser("krishna", " k4342","krish@12343", 1000);// here we are calling the constructor which expects arguments in terms of(string , string , string , Integer
	SBIUser  mohan = new SBIUser("mohan", " m3312","mohan@12343", 20000);
	//type    ref. name new object created for the class SBIUser class with constructor SBIUser();
	System.out.println("Main end here...........");
}
}
