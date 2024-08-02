//compareTo function
//in the product super class

public class Product{


public Pr

public int compareTo(Product other)
{
	String thisField = getBarcodeNumber().charAt(0)+getName();
	String otherField = other.getBarcodeNumber().charAt(0)+getName();
	return thisField.compareTo(otherField);
	
	
	
	
	