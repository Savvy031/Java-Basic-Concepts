public class SequentialSearch
{
	
	public static int sequentialSearch(int[] anArray , int item)
	{
		
		int pos = 0;
		boolean found = false;
		
		//while the position nr is less than the length of the array and found is false implying that the element that we are searching for is not found
		//while the condition in the while loop is true do the following:
		
		while(pos < anArray.length && !found)
		{
			//Check if the item in the array at position pos is equal to the item that we are searching for
			if(anArray[pos] == item)
			{//if the item is found then set fouind to true so that the while loop can exitt
				found = true;
			}
			else
			{
				
				//else if it is not found increment position so that it can check the other elements in the array
				pos++;
				
			}
			
		}
		if(found)
		{
			//Return the position of the item that is found to be the same 
			return pos ;
		}
		else
		{
			//if it is not found then retirn the number - 1
			return -1;
		}
	}
	
	
	public static void main(String[] args)
	{
		int arr[] = {54,26,93,17,77,31,44,55,20,65};
		System.out.println("The value 50 is at index" + sequentialSearch(arr, 50));
		System.out.println("The value 44 is at index" + sequentialSearch(arr, 44));
	}
	
		
}

			
			
			
			