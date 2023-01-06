package ayoconnect_training;

public class sample_customexception 
{
	public static void main(String[] args) 
	{
		try
		{
			validate(14);
		}
		catch (InvalidAgeException e)
		{
			System.out.println(e.getMessage());
		}
	}
	public static void validate(int age) throws InvalidAgeException
	{
		if(age<18)
		{
			throw new InvalidAgeException("not fit for voting");
		}
		else
		{
			System.out.println("fit for voting");
		}
		
	}

}
