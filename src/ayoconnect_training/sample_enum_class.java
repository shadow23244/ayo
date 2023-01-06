package ayoconnect_training;

public class sample_enum_class
{
	public static void main(String[] args)
	{
		sample_enum s=sample_enum.JAN;
		
		if(s==sample_enum.JAN)
		{
			System.out.println("its january");
		}
		
		System.out.println(sample_enum.valueOf("FEB").ordinal());
		System.out.println("----------------------------------------");
		for(sample_enum a1 : sample_enum.values())
		{
			System.out.println(a1+" "+a1.VALUE);
		}
		
	}

}
