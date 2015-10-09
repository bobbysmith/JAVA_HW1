package bobby.inheritance;
import java.util.GregorianCalendar;


public abstract class Employee {
	protected String name;
	protected double wage;
	protected GregorianCalendar hireDate;
	
	public Employee(String name, double wage, int day, int month, int year) {
		this.name = name;
		this.wage = wage;
		this.hireDate = new GregorianCalendar(day, month, year);
	}
	
	public double generatePaycheck() {
		return 0;
	}
}
