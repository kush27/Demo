package string;

import java.util.Scanner;

public class ReverseWord
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A String:");
		String str = sc.nextLine();
		sc.close();

		String[] sa = str.split("\\s");
		
		for (int i = 0; i < sa.length; i++)
		{
			char[] ca =sa[i].toCharArray();
			
			for (int j = ca.length-1;j>=0;j--) 
			{
				System.out.print(ca[j]);
			}
			System.out.print(" ");
		}

	}

}
