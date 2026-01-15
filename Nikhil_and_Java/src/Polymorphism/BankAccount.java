package Polymorphism;

public class BankAccount {

	// No of Parameter can be different
	
//	void processPayment(String upiId)	// 1
//	{
//		
//	}
//	
//	void processPayment(String phonePayNumber,double amount)	//2
//	{
//		
//	}
//	
//	void processPayment()	//0
//	{
//		
//	}
	
	
	// Type of Parameter can be different
	
//	void processPayment(String upiId)	// 1
//	{
//		
//	}
//		
//	void processPayment(long phonePayNumber)	//1
//	{
//			
//	}
//		
//	void processPayment(int debitCardNumber)	//1
//	{
//			
//	}
	
	
	// Sequence of Parameter can be different
	
	void processPayment(String upiId,double amount)	// 2
	{
			
	}
			
	void processPayment(double amount,String phonePayNumber)	//2
	{
				
	}
			
	void processPayment()	//0
	{
		
	}
	
}
