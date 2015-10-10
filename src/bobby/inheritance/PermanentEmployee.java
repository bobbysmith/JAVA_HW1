package bobby.inheritance;
/***
 * 
 * @author bobbysmith
 *
 */
public class PermanentEmployee extends Employee {

	protected double vacationBalance;
	
	public PermanentEmployee(String name, double wage, int day, int month, int year) {
		super(name, wage, day, month, year);
	}
	
	public void recordVacation(double hoursTaken) {
		vacationBalance -= hoursTaken;
	}
	
	
	public double generatePaycheck() {
		vacationBalance += 5;
		double paycheck = wage / 26;
		System.out.println("New vacation balance is: " + vacationBalance);
		System.out.println("Permanent Employee annual wage is: " + wage);
		System.out.printf("Current paycheck is: %.2f\n\n", paycheck);
		return paycheck;
	}
	
	
	
}
