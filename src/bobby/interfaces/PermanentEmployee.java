package bobby.interfaces;
import java.util.GregorianCalendar;


public class PermanentEmployee implements Employee {

	protected String name;
	protected double wage;
	protected GregorianCalendar hireDate;
	protected double vacationBalance = 0;
	private double hours;
	
	public PermanentEmployee(String name, double wage, int day, int month, int year) {
		this.name = name;
		this.wage = wage;
		hireDate = new GregorianCalendar(day, month, year);
	}
	
	
	public double generatePaycheck() {
		vacationBalance += 5;
		double paycheck = wage / 26;
		System.out.println("New vacation balance is: " + vacationBalance);
		System.out.println("Permanent Employee annual wage is: " + wage);
		System.out.printf("Current paycheck is: %.2f\n\n", paycheck);
		return paycheck;
	}

	public void recordVacation(double hoursTaken) {
		vacationBalance -= hoursTaken;
	}

	public String getName() {
		return name;
	}

	public double getWage() {
		return this.wage;
	}

	public GregorianCalendar getHireDate() {
		return hireDate;
	}

	public void setHours(double h) {
		this.hours = h;
	}
	
	
}
