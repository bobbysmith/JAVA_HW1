package bobby.exceptions;

public class WageException extends Exception {
	
	protected double wage;
	
	public WageException(double wage){
		this.wage = wage;
	}
}
