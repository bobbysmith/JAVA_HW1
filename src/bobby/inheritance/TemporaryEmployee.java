package bobby.inheritance;

public class TemporaryEmployee extends Employee {
	
	private double hoursWorked = 0;

	public TemporaryEmployee(String name, double wage, int day, int month, int year, double hours) {
		super(name, wage, day, month, year);
		this.hoursWorked = hours;
	}
	
	@Override
	public double generatePaycheck() {
		return wage * hoursWorked;
	}

}
