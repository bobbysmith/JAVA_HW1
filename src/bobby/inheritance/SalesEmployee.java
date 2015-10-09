package bobby.inheritance;

public class SalesEmployee extends PermanentEmployee {
	
	private double sales;
	private double commission;

	public SalesEmployee(String name, double wage, int day, int month, int year) {
		super(name, wage, day, month, year);
	}
	
	public double generatePaycheck(double sales, double commission) {
		recordVacation();
		return (wage / 26) + (sales * commission);
	}

}
