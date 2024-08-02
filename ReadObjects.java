import java.io.*;
import java.util.*;


public class ReadObjects
{
	private static  ObjectInputStream input;
	
	public static void  openOutputFile()
	{
		try
		{
			input= new ObjectInputStream(new FileInputStream("productdata.ser"));
				
				
		}
		catch(IOException ioE)
		{
				
				
			System.out.println("There was an error opening the file ");
			System.exit(1);
		}
			
			
	}
	
	public static void closeInputFile()
	{
		
		try
		{
			input.close();
			
		}
		catch(IOException ioE)
		{
			
			
			System.out.println("There was an error opening the file ");
			System.exit(1);
		}
		
	}
	
	
	public static void main(String[] args)
	{
		openOutputFile();
		
		try
		{
			Product1 record;
			
			
			System.out.println("These are the deserialized products");
			while(true )
			{
				record =(Product1)input.readObject();
				System.out.println(record);
			
			}
			
			
		}
		catch(EOFException e)
		{
			System.out.println("EOF has been reached");
			
		}
		catch(IOException ioE)
		{
			
			System.out.println("There was a problem opening the file");
		}
		catch(Exception ex)
		{
			System.out.println("Big probem" + ex);
		}
		
		closeInputFile();
	
	}
}
		
		
		
