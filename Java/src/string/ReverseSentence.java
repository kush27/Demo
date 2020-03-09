package string;

import java.util.Scanner;

public class ReverseSentence
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A String:");
		String str = sc.nextLine();
		sc.close();
		
		String[] sa = str.split(" ");
		
		for (int i=sa.length-1;i>=0; i--) 
		{
			System.out.print(sa[i]+" ");
		}
		
	}

}
