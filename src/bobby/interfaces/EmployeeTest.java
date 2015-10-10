package bobby.interfaces;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee dave = new PermanentEmployee("Dave", 30000.0, 1, 1, 2012);
		Employee amy = new PermanentEmployee("Amy", 40000.0, 1, 1, 2011);
		Employee brian = new TemporaryEmployee("Brian", 15.0, 4, 7, 2014, 26);
		Employee jenny = new TemporaryEmployee("Jenny", 12.0, 5, 10, 2014, 35);
		Employee dan = new SalesEmployee("Dan", 25000.0, 14, 3, 2012, 100000.0, 0.03);
		Employee eric = new SalesEmployee("Eric", 28000.0, 28, 7, 2012, 75000, 0.05);
		
		System.out.println(dave.generatePaycheck());
		System.out.println(amy.generatePaycheck());
		System.out.println(brian.generatePaycheck());
		System.out.println(jenny.generatePaycheck());
		System.out.println(dan.generatePaycheck());
		System.out.println(eric.generatePaycheck());
	}

}
