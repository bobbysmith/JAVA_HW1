package bobby.exceptions;

public class WageExceptionTest {

	static double[] wages = {-2.0, 0.0, 3.0, 6.0, 100.0, 199.0, 250.0};
	public static final double MINWAGE = 6.0;
	public static final double MAXWAGE = 200.0;
	
	public static void main(String[] args) {
		for (int i = 0; i < wages.length; i++) {
			try {
				verifyEmployeeWage(wages[i]);
			} catch(WageException e) {
				System.err.println(e.getMessage());
				e.printStackTrace();
				System.err.println();
			}
		}
	}
	
	public static void verifyEmployeeWage(double w) throws WageException {
		System.out.println("Verifying wage: " + w);
		if (w <= 0.0) {
			throw new IllegalWageException(w);
		} else if (w < MINWAGE) {
			throw new MinWageException(w, MINWAGE);
		} else if (w > MAXWAGE) {
			throw new MaxWageException(w, MAXWAGE);
		} else {
			System.out.println("Wage " + w + " is valid.\n");
		}
		
	}
}
