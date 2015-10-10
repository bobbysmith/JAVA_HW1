package bobby.interfaces;

public class SalesEmployee extends PermanentEmployee implements ISales {
	
	private double sales;
	private double commission;

	public SalesEmployee(String name, double wage, int day, int month, int year, double sales, double commission) {
		super(name, wage, day, month, year);
		this.sales = sales;
		this.commission = commission;
	}
	
	@Override
	public double generatePaycheck() {
		recordVacation();
		return (wage / 26) + (sales * commission);
	}

}
