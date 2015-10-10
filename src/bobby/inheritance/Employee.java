package bobby.inheritance;
import java.util.GregorianCalendar;


public abstract class Employee {
	
	protected String name;
	protected double wage;
	protected GregorianCalendar hireDate;
	protected double numberOfHours;
	protected double sales;
	protected double commission;
	
	public Employee(String name, double wage, int day, int month, int year) {
		this.name = name;
		this.wage = wage;
		this.hireDate = new GregorianCalendar(day, month, year);
	}
	
	public abstract double generatePaycheck();
	
	public String getName() {
		return name;
	}
	
	public void setHours(double n) {
		numberOfHours = n;
	}
	
	// no sales for generic employees
	public void setSales(double s) {
		sales = 0;
	}
	
//	no commission for generic employees
	public void setCommission(double c) {
		commission = 0;
	}
}