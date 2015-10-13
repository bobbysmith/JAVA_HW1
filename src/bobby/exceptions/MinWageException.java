package bobby.exceptions;

public class MinWageException extends WageLimitException {
	
	protected double wageDiff;

	public MinWageException(double wage, double wageLimit) {
		super(wage, wageLimit);
		wageDiff = wageLimit - wage;
	}
	
	public String getMessage() {
		return "Requested wage " + wage + " falls below minimum wage of " + wageLimit + " by " + wageDiff + ".";
	}

}
