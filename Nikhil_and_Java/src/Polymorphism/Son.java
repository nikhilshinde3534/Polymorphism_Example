package Polymorphism;

public class Son extends Father{

	@Override
	void bankBalance()
	{
		System.out.println("10 Lakh");
	}
	
	public static void main(String[] args) {
		
		Son son = new Son();
		son.bankBalance();
	}
}
