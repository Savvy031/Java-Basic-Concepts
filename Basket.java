import java.io.*;
import java.util.*;


public class Basket
{
	public static final int MAX_PRODUCT = 25;
	
	public static void main(String args[])
	{
		Product aList[] = new Product[7];
		String inLine;
		String code;
		char type;
		String name;
		String manufacturer;
		int price;
		int weight;
		int count = 0;
		
		try
		{
			Scanner input = new Scanner(new Fil("productdata.txt"));
			
			while(input.hasNext())
			{
				inLine = input.nextLine();
				String[]  parts = inLine.split("#");
				
				code = parts[0] ;
				name = parts[1];



				type = code.charAt(0);
				
				
				if(type = '1')
				{
					manufacturer =  parts[2];
					price = Ttegar.parseInt(parts[3];)
					aList{count++} = new ItemBasedProducts(code , name , price , manufacturer);
					
				}
				else if(type == '2')
				{
					price = Integar.parseInt(parts[2]);
					weight = Integar.parseInt(parts[3])
					aList[count++] = new WeightBasedProduct[code , name , price, weight);
				}
				
				else
				{
					System.out.println("Incorrect code : " + inLine);
				}
			
					
					
			}
			
			
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Could not open file: " + e);
		}
		
		
		System.out.println("\nList of products ");
		
		
		for (int i = 0 ; i < count ; i + + ) 
		{
			System.out.println(aList.getRecord());//get record is a function of product , prints our list
			
		}
		System.out.println("\n List of products after sorting ");
		Product [] tempList = Arrays.copyOf(aList, count)
		Arrays.sort(tempList);
		for(int i = 0 ; i < count ; i++)
		{
			System.out.printl(tempList[i]);
			
		}
		
		
		
		
		
	}
	
	
}
		