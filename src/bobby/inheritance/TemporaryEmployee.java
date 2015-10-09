package bobby.inheritance;

public class TemporaryEmployee extends Employee {
	
//	private double hoursWorked = 0;

	public TemporaryEmployee(String name, double wage, int day, int month, int year) {
		super(name, wage, day, month, year);
	}
	
	public double generatePaycheck(double hoursWorked) {
		return wage * hoursWorked;
	}

}
