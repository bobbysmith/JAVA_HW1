package bobby.inheritance;
/***
 * 
 * @author bobbysmith
 *
 */
public class PermanentEmployee extends Employee {

	private int vacationBalance;
	
	public PermanentEmployee(String name, double wage, int day, int month, int year) {
		super(name, wage, day, month, year);
	}
	
	public void recordVacation() {
		vacationBalance += 5;
	}
	
	@Override
	public double generatePaycheck() {
		recordVacation();
		return wage / 26;
	}
	
	
	
}
