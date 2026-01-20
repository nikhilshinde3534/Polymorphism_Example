package Polymorphism;

public class JavaDeveloper extends Employee{

	@Override
	void calculateSalary()
	{
		hours=8;
		
		hourlyRate=400;
		
		dailySalary = hourlyRate * hours;
		
		monthlySalary = dailySalary * 30;
		
		System.out.println("Java Developer Monthly Salary : "+monthlySalary);
	}
	
	public static void main(String[] args) {
		
		Employee e = new Employee();
		e.calculateSalary();
		
		
		JavaDeveloper j = new JavaDeveloper();
		j.calculateSalary();
		
		
		PythonDeveloper p = new PythonDeveloper();
		p.calculateSalary();
		
	}
}
