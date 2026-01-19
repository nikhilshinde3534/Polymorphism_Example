package Polymorphism;

import java.util.Scanner;

public class Instagram {

	Scanner sc = new Scanner(System.in);
	
	void login(String mobileNumber)
	{
		String otp="";
		for(int i=1;i<=6;i++)
		{
			otp=otp+(int) (Math.random()*10);
		}
		System.out.println("Your OTP is : "+otp);
		
		System.out.println("Enter OTP....!");
		String userOtp=sc.next();
		if(userOtp.equals(otp))
		{
			System.out.println("Login Success");
		}
		else
		{
			System.out.println("Login Failed");
		}
	}
			
	void login(String username,String password)
	{
		if(username.equals("nikhil") && password.equals("1212"))
		{
			System.out.println("Login Success");
		}
		else
		{
			System.out.println("Login Failed");
		}
	}
	
	public static void main(String[] args) {
		
		Instagram i=new Instagram();
		i.login("7499765936");
		i.login("nikhil", "1212");
	
	}
}
