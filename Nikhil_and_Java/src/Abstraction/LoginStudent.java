package Abstraction;

public class LoginStudent extends Student{

	void loginStudent() 
	{
		if(id==12)
		{
			System.out.println("Login Success");
		}
	}

	public static void main(String[] args) {
		
		LoginStudent login = new LoginStudent();
		login.loginStudent();
				
	}
}

	// Day 29 37.00