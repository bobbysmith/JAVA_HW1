package bobby.inheritance;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee dave = new PermanentEmployee("Dave", 30000.0, 1, 1, 2012);
		Employee amy = new PermanentEmployee("Amy", 40000.0, 1, 1, 2011);
		Employee brian = new TemporaryEmployee("Brian", 15.0, 4, 7, 2014);
		Employee jenny = new TemporaryEmployee("Jenny", 12.0, 5, 10, 2014);
		Employee allan = new SalesEmployee("Allan", 25000.0, 14, 3, 2012);
		Employee eric = new SalesEmployee("Eric", 28000.0, 28, 7, 2012);
		double check = dave.generatePaycheck();
//		brian.generatePaycheck(27);
		System.out.println(check);
	}

}