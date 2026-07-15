package com.sbi.user2;

class PaymentSystem extends Object{  
	
    public PaymentSystem(String status) {
		 super();
		 System.out.println(status);
		 
	 }
 }
 class Payment extends PaymentSystem{
	 
   public Payment(int rupey) {
		 super("krishna");
	 System.out.println(rupey);
	 }
 }
 
 class UpiPayment extends Payment{
	 
	 public UpiPayment() {
		 super(89);
		 
	 }
	 
 }
      public class Driver {
	
	public static void main(String args[]) {
		
		PaymentSystem p1 = new PaymentSystem("krishna");
		Payment p2 = new Payment(56);
		Payment p5 = new Payment(78);
		UpiPayment p3 = new UpiPayment();
		UpiPayment p4 = new UpiPayment();
		
	
	}
	
	
    
}



