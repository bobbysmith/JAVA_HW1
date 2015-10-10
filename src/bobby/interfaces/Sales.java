package bobby.interfaces;

public interface Sales extends Employee {
	
	public void setSales(double s);
	
	public void setCommissionRate(double c);
	
	public double calculateCommission(double s, double c);
	
}
