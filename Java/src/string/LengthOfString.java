package string;

import java.util.Scanner;

public class LengthOfString 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A String:");
		String str = sc.nextLine();
		sc.close();

//		int i = str.length();
//		System.out.println(i);
		
		char[] ca = str.toCharArray();
//		System.out.println(ca.length);
		
		int count = 0;
		for (@SuppressWarnings("unused") char c : ca) 
		{
			count++;
		}
		System.out.println(count);
	}

}
