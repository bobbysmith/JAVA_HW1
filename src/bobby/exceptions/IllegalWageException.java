package bobby.exceptions;

public class IllegalWageException extends WageException {

	public IllegalWageException(double wage) {
		super(wage);
	}
	
	public String getMessage() {
		return "Requested wage " + wage + " is not a legal wage request.  Wage must be positive number.";
	}

}
