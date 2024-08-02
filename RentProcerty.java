public class RentProcerty extends Property
{
	private double rentPm;
	private int duration;
	
	public RentProcerty()
	{
		
	}
	
	public RentProcerty(String code , String agent , double rentPm, int duration)
	{
		super(code,agent);
		setRentPm(rentPm);
		setDuration(duration);
		
	}
	
	public double calculateCommission(double com)
	{
		double total;
		total = getRentPm() * com ;
		
		
		if(getCode().charAt(1) > 2)
		{
			
			total = getRentPm() * (com + 2.5);
		}
		else
		{
			total = getRentPm() * com ;
		}
		
		return total;
	}
	
	
	public double calculateTotal()
	{
		double total ;
		
		
		total = getRentPm() * (double)(getDuration());
		
		return total;
	}
	
	public void setRentPm(double rentPm)
	{
		this.rentPm = rentPm;
	}
	public void setDuration(int duration)
	{
		this.duration = duration;
		
	}
	
	public double getRentPm()
	{
		return rentPm;
	}
	
	public int getDuration()
	{
		return duration;
		
	}
	
	
	public String toString()
	{
		return "Code: " + getCode() + "Agent: " + getAgent() + "Rent per month: " + getRentPm() + "Duration: " + getDuration();
	}
}
	
