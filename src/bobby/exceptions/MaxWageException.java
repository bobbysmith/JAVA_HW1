package bobby.exceptions;

public class MaxWageException extends WageLimitException {
	
	protected double wageDiff;

	public MaxWageException(double wage, double wageLimit) {
		super(wage, wageLimit);
		wageDiff = wage - wageLimit;
	}
	
//	public double getWageDiff() {
//		return wageDiff;
//	}
	
	public String getMessage() {
		return "Requested wage " + wage + " exceeds maximum wage of " + wageLimit + " by " + wageDiff + ".";
	}
	
}