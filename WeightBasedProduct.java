
import java.io.*;
import java.util.*;
public class WeightBasedProduct extends Product1 implements  Serializable
{
	private int unitPrice;
	private int weight;
	
	public WeightBasedProduct()
	{
		
	}
	
	public WeightBasedProduct(String barcode , String name , int unitPrice , int weight)
	{
		super(barcode , name );
		
		setUnitPrice(unitPrice);
		setWeight(weight);
		
	}
	public double cost()
	{
		return getWeight() * getUnitPrice() + (getWeight() * getUnitPrice() * 0.15);
	}
	
	
	public void setUnitPrice(int unitPrice)
	{
		this.unitPrice = unitPrice;
	}
	
	public void setWeight(int weight)
	{
		this.weight = weight;
	}
	
	public int getUnitPrice()
	{
		return unitPrice;
	}
	
	public int getWeight()
	{
		return weight;
	}
	
	public String toString()
	{
		
		return "Code: " + getBarcode() + "Name of product : " + getName() +  " Unit Price " + getUnitPrice() + "Weight: " + getWeight();
	}
	
	
}
		
