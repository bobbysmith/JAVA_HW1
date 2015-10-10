package bobby.interfaces;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee dave = new PermanentEmployee("Dave", 30000.0, 1, 1, 2012);
		Employee amy = new PermanentEmployee("Amy", 40000.0, 1, 1, 2011);
		Employee brian = new TemporaryEmployee("Brian", 15.0, 4, 7, 2014);
		Employee jenny = new TemporaryEmployee("Jenny", 12.0, 5, 10, 2014);
		SalesEmployee allan = new SalesEmployee("Allan", 25000.0, 14, 3, 2012);
		SalesEmployee eric = new SalesEmployee("Eric", 28000.0, 28, 7, 2012);
		

		System.out.println("Dave");
		dave.generatePaycheck();
		
		System.out.println("Amy");
		amy.generatePaycheck();
		
		System.out.println("Brian");
		brian.setHours(25.0);
		brian.generatePaycheck();
		
		System.out.println("Jenny");
		jenny.setHours(35.0);
		jenny.generatePaycheck();
		
		System.out.println("Allan");
		allan.setSales(50000);
		allan.setCommissionRate(0.05);
		allan.generatePaycheck();
		
		System.out.println("Eric");
		eric.setSales(80000);
		eric.setCommissionRate(0.08);
		eric.generatePaycheck();
	}
	
}
