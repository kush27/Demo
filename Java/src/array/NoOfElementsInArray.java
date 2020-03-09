package array;

import java.util.Scanner;

public class NoOfElementsInArray
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A String");
		String str = sc.nextLine();
		sc.close();
		
		char[] ca =str.toCharArray();
		
		int count =0;
		for(@SuppressWarnings("unused") char c:ca)
		{
			count++;
		}
		System.out.println(count);
	}

}
