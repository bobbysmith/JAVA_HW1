package bobby.exceptions;

public class WageLimitException extends WageException {
	
	protected double wageLimit;
	
	 public WageLimitException(double wage, double wageLimit) {
		super(wage);
		this.wageLimit = wageLimit;
	}
}
