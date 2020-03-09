package string;

import java.util.Scanner;

public class ReverseString
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A String:");
		String str = sc.nextLine();
		sc.close();
		
		char[] ca = str.toCharArray();
		
		for(int i=ca.length-1;i>=0;i--)
		{
			System.out.print(ca[i]);
		}

	}

}
