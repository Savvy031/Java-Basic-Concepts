
import java.io.*;
import java.util.*;
public class ItemBasedProduct extends Product1 implements  Serializable
{
	private String manufacturer;
	private int unitPrice;

	public ItemBasedProduct()
	{
		
	}
	
	public ItemBasedProduct(String barcode , String name , String manufacturer , int unitPrice)
	{
		super(barcode , name);
		setManufacturer(manufacturer);
		setUnitPrice(unitPrice);
		
	}
	
	public double cost()
	{
	   return getUnitPrice() + (0.15 * getUnitPrice());
	}
	
	
	public void setManufacturer(String manufacturer)
	{
		this.manufacturer = manufacturer;
	}
	
	public void setUnitPrice(int unitPrice)
	{
		this.unitPrice = unitPrice;
	}
	
	public String getManufacturer()
	{
		return manufacturer;
		
	}
	public int getUnitPrice()
	{
		return unitPrice;
	}
	
	public String toString()
	{
		return "Code: " + getBarcode() + "Name of product " + getName() + "Manufacturer: "  + getManufacturer() + "Unit Price : " + getUnitPrice();
	}
	
	
}