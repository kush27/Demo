package string;

public class StringComparison
{
	public static void main(String[] args)
	{
		String str1 = "My Name Is Kush Kumar";
		String str2 = "MY Name Is Kush Kumar";

//		if(str1.equals(str2))
//		{
//			System.out.println("Both Are Same");
//		}
//		else
//		{
//			System.out.println("Both Are Not Same");
//		}
		
		if(str1==str2)
		{
			System.out.println("Both Are Same");
		}
		else
		{
			System.out.println("Both Are Not Same");
		}
		
		if(str1.equalsIgnoreCase(str2))
		{
			System.out.println("Both Are Same");
		}
		else
		{
			System.out.println("Both Are Not Same");
		}

	}

}
