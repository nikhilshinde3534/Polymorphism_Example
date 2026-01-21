package Polymorphism;

public class PythonDeveloper extends Employee{

	void calculateSalary()
	{
		hours=8;
		
		hourlyRate=200;
		
		dailySalary = hourlyRate * hours;
		
		monthlySalary = dailySalary * 30;
		
		System.out.println("Python Developer Monthly Salary : "+monthlySalary);
	}
}
