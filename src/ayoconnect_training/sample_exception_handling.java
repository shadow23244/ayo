package ayoconnect_training;

public class sample_exception_handling 
{
	public static void main(String[] args) 
	{
		int [] a= new int [3];
		
		try
		{
			System.out.println(a[10]);
		}
		catch (ArithmeticException e)
		{
			System.out.println("Arithmetic Exception handled");
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBounds Exception handled");
		}
		catch (Exception e)
		{
			System.out.println("generalised exception");
			e.printStackTrace();
		}
		finally {
			System.out.println("length of index is out of bounds");
		}
		
		
		System.out.println("exception is being handled");
		
	}
	
	

}
