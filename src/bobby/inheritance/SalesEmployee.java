package bobby.inheritance;

public class SalesEmployee extends PermanentEmployee {
	

	public SalesEmployee(String name, double wage, int day, int month, int year) {
		super(name, wage, day, month, year);
	}
	
	public void setSales(double s) {
		sales = s;
	}
	
	public void setCommission(double c) {
		commission = c;
	}
	
	
	public double generatePaycheck() {
		vacationBalance += 5;
		double paycheck = (wage / 26) + (sales * commission);
		
		System.out.println("New vacation balance is: " + vacationBalance);
		System.out.println("Sales Employee annual wage is: " + wage);
		System.out.printf("Sales volume: %.2f\n", sales);
		System.out.printf("Commission rate: %.2f\n", commission);
		System.out.printf("Current paycheck is: %.2f\n\n", paycheck);
		return paycheck;
	}

}
