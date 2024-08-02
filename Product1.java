import java.io.*;
import java.util.*;



public abstract class Product1 implements Calculate , Comparable<Product1>, Serializable	
{
	private String barcode;
	private String name;
	
	
	public Product1()
	{
		
	}
	
	public Product1(String barcode , String name)
	{
		setBarcode(barcode);
		setName(name);
	}
	
	public abstract double cost();
	
	public void setBarcode(String barcode)
	{
		this.barcode = barcode;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getBarcode()
	{
		return barcode;
		
	}
	
	public String getName()
	{
		return name;
		
	}
	
	
	public String toString()
	{
		return "The barcode of the product is: " + getBarcode() + "the name of the product is " + getName();
		
	}
	
	public int compareTo(Product1 other)
	{
		
		String thisField = getBarcode().charAt(0) + getName();
		String otherField = other.getBarcode().charAt(0) + getName();
		
		return thisField.compareTo(otherField);
		
	}
	
/*ublic static void main(String[] args)
	{
		ItemBasedProduct p1 = new ItemBasedProduct("178030640227" , "Milk, 1L" , "Clover " , 1550);
		
		System.out.println(p1);
		
		WeightBasedProduct w1 = new WeightBasedProduct("245134867532" , "Bananas" , 4300 , 540);
		System.out.println(w1);
		
	}
	
	*/
}
