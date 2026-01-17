package Polymorphism;

public class Employee {
	
	int hours=8;
	
	int hourlyRate=150;
	
	int dailySalary;
	
	int monthlySalary;

	void calculateSalary()
	{
		hours=8;
		
		hourlyRate=150;
		
		dailySalary = hourlyRate * hours;
		
		monthlySalary = dailySalary * 30;
		
		System.out.println("Monthly Salary : "+monthlySalary);
	}
}
