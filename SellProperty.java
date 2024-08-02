public class SellProperty extends Property
{
	private double price;
	public SellProperty()
	{
		
		
	}
	
	
	public SellProperty(String code , String agent , double price)
	{
		super(code, agent);
		setPrice(price);
		
	}
	
	public void setPrice(double price)
	{
		this.price = price;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	
	public double calculateTotal()
	{
		double TAX1 = 0.0;
		double TAX2 = 0.10;
		double TAX3 = 0.15;
		
		double total;
		if(getPrice() <= 500000.00)
		{
			total = getPrice()+ TAX1;
		}
		else if(getPrice() > 500000.00 && getPrice() <= 1000000.00)
		{
			total = (getPrice() * TAX2) + getPrice();
		}
		else 
		{
			total = (getPrice() * TAX3) + getPrice();
		}
		
		return total;
	}
	
	public double calculateCommission(double com)
	{
		double total;
		
		if(getCode().charAt(1) > 2)
		{
			
			total = (calculateTotal() * (com + 2.5)) - calculateTotal();
		}
		else
		{
			total = (calculateTotal() * com)- calculateTotal();
		}
		return total;
		
	}
	
			
	
	public String toString()
	{
		return "Code : " + getCode() + "Agent " + getAgent() + "Selling price" + getPrice();
		
		
		
	}
	
	
}
