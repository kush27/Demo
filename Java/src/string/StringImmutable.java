package string;

public class StringImmutable
{
	public static void main(String[] args) 
	{
		String str1 = "My Nmae Is";
		String str2 = str1.concat("Kush");
		
		if(str1.equals(str2))
		{
			System.out.println("Mutable");
		}
		else
		{
			System.out.println("Immutable");
		}

	}

}
