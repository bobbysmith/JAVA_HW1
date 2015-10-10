package bobby.interfaces;
import java.util.GregorianCalendar;


public interface Employee {
	
//	protected String name;
//	protected double wage;
//	protected GregorianCalendar hireDate;
//	protected double numberOfHours;
//	protected double sales;
//	protected double commission;
//	
//	public Employee(String name, double wage, int day, int month, int year) {
//		this.name = name;
//		this.wage = wage;
//		this.hireDate = new GregorianCalendar(day, month, year);
//	}
	
	public double generatePaycheck();
	
	public void recordVacation(double hoursTaken);

	public String getName();
	
	public double getWage();
	
	public GregorianCalendar getHireDate();
	
	public void setHours(double h);

}