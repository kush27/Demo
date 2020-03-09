package string;

import java.util.Scanner;

public class RemoveSpacesFromString 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A String");
		String str = sc.nextLine();
		sc.close();

		char[] ca = str.toCharArray();
		
	    String s = " ";
		for(char c:ca)
		{
			if(c!=' ')
			{
				s=s+c;
			}
		}
        System.out.println(s);
	}

}
