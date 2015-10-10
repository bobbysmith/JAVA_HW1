package bobby.interfaces;

import java.util.GregorianCalendar;

public class TemporaryEmployee implements Employee {
	
	protected String name;
	protected double wage;
	protected GregorianCalendar hireDate;
	private double numberOfHours;
	
	public TemporaryEmployee(String name, double wage, int day, int month, int year) {
		this.name = name;
		this.wage = wage;
		hireDate = new GregorianCalendar(day, month, year);
	}
	
	public void setHours(double n) {
		numberOfHours = n;
	}
	
	
	public double generatePaycheck() {
		double paycheck = wage * numberOfHours;
		
		System.out.println("Temporary Employee hourly wage is: " + wage);
		System.out.println("Hours worked: " + numberOfHours);
		System.out.printf("Current paycheck is: %.2f\n\n", paycheck);
		return paycheck;
	}


	public void recordVacation(double hoursTaken) {
		System.out.println("Temporary employees do not have vacation hours.");		
	}

	public String getName() {
		return name;
	}

	public double getWage() {
		return wage;
	}


	public GregorianCalendar getHireDate() {
		return hireDate;
	}

}
