import java.io.*;


public abstract class Property implements Serializable , Comparable <Property>
{
	
	
	private String code;
	private String agent;
	
	public Property()
	{
		
		
	}
	
	public Property(String code , String agent)
	{
		setCode(code);
		setAgent(agent);
		
	}
	
	public abstract double calculateTotal();
	public abstract double calculateCommission(double comm);
	
	
	public void setCode(String code)
	{
		this.code = code;
	}
	
	public void setAgent(String agent)
	{
		this.agent = agent;
	}
	
	public String getCode()
	{
		return code;
	}
	
	public String getAgent()
	{
		return agent;
	}
	
	public String toString()
	{
		
		return "Code"+ "\t" + getCode()+ "Agent"+"\t"+ getAgent();
	}
	
	
	
	public int compareTo(Property other)
	{
		
		String thisField = getCode();
		String otherField = other.getCode();
		return thisField.compareTo(otherField);
	}
	
	
	/*public static void main(String[] args)
	{
		SellProperty sell = new SellProperty("1243022019" , "Sims" , 870000.00 );
		RentProcerty rent = new RentProcerty("2343052019" , "Pazozo" , 8000.00 , 24);
		
		System.out.println(sell);
		System.out.println(sell.calculateTotal());
		System.out.println(sell.calculateCommission(0.05));
		
		
		System.out.println("\n");
		System.out.println(rent);
		System.out.println(rent.calculateTotal());
		System.out.println(rent.calculateCommission(0.05));
	}*/
		
	
}
 