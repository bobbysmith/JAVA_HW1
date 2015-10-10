package bobby.inheritance;

public class TemporaryEmployee extends Employee {
	
	

	public TemporaryEmployee(String name, double wage, int day, int month, int year) {
		super(name, wage, day, month, year);
	}
	
	
	
	public double generatePaycheck() {
		double paycheck = wage * numberOfHours;
		
		System.out.println("Temporary Employee hourly wage is: " + wage);
		System.out.println("Hours worked: " + numberOfHours);
		System.out.printf("Current paycheck is: %.2f\n\n", paycheck);
		return paycheck;
	}

}
