import java.util.*;
import java.io.*;

public class TestApplication implements Serializable 
{
	
	private static Scanner input;
	private static ObjectOutputStream output;
	
	
	public static void openInputFile()
	{
		
		try
		{
			 input = new Scanner(new File("productdata.txt"));
			 input.useDelimiter("[#\\n\\r]");
			
		}
		catch(IOException ioE)
		{
			
			
			System.out.println("There was an error opening the file ");
			System.exit(1);
			
		}
	}
	
	public static void  openOutputFile()
	{
		try
		{
			 output = new ObjectOutputStream(new FileOutputStream("productdata.ser"));
			
			
		}
		catch(IOException ioE)
		{
			
			
			System.out.println("There was an error opening the file ");
			System.exit(1);
		}
		
		
	}
	
	public static void closeInputFile()
	{
		input.close();
	}
	
	
	public static void closeOutputFile()
	{
		
		try
		{
			output.close();
			
		}
		catch(IOException ioE)
		{
			
			
			System.out.println("There was an error opening the file ");
			System.exit(1);
		}
		
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] args)
	{
		Product1[] products = new Product1[25];
		int nrOfObjects = 0 ; 
		
		String code ;
		String name ;
		String manufacturer;
		int unitPrice;
		int weight;
		openInputFile();
		
		Scanner input ;
		
		try
		{
			
			input = new Scanner(new File("productdata.txt"));
			
			while(input.hasNextLine())
			{
				String line = input.nextLine();
				
				String[] parts = line.split("#");
				
				code = parts[0];
				name = parts[1];
				
				if(code.charAt(0) == '1')
				{
					manufacturer = parts[2];
					unitPrice = Integer.parseInt(parts[3]);
					
					products[nrOfObjects++] =  new ItemBasedProduct(code , name , manufacturer , unitPrice);
					
				}
				
				else if(code.charAt(0) == '2')
				{
					unitPrice = Integer.parseInt(parts[2]);
					weight = Integer.parseInt(parts[3]);
					
					products[nrOfObjects++] = new WeightBasedProduct(code , name , unitPrice , weight);
				}
			}
		}
			
		catch(IOException e)
		{
			System.out.println("The was an errror opening your file" + e);
			System.exit(1);
			
			
		}
		
		System.out.println("The items before sorting : " ) ;
		
		for(int i = 0 ; i < nrOfObjects ; i++)
		{
			System.out.println(products[i]);
			
		}
		
		
		for(int i = 0 ; i < nrOfObjects ; i++)
		{
			if(products[i] instanceof WeightBasedProduct)
			{
				WeightBasedProduct w1 = (WeightBasedProduct)products[i];
				System.out.println(w1.getWeight());
				
			}
		}
		System.out.println("The items after sorting : " );
		
		 
		
		Product1[]tempArr= Arrays.copyOf(products , nrOfObjects);
		Arrays.sort(tempArr);
		
		for(int i = 0 ; i < nrOfObjects ; i++)
		{
			System.out.println(tempArr[i]);
		}
		
		
		
		
		// Serialise 
		openOutputFile();
		openInputFile();
		try
		{
			
			for(int i = 0 ; i < nrOfObjects ; i++)
			{
				output.writeObject(products[i]);
				System.out.println(products[i]);
			}
		}
		catch(IOException e)
		{
			
			
			System.out.println("The was an errror opening your file" + e);
			System.exit(1);
		}
		
		closeInputFile();
		closeOutputFile();
	}
		
	

}
			
			
