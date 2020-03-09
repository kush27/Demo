package string;

import java.util.Scanner;

public class NoOfVowelsAndConsonents
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A String:");
		String str = sc.nextLine();
		sc.close();
		
		char[] ca = str.toCharArray();
		
		int count1 = 0;
		int count2 = 0;
	    for (char c : ca) 
	    {
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
			{
				count1++;
			}
			else
			{
				count2++;
			}
		}
       System.out.println("No Of Vowels:"+count1);
       System.out.println("No Of Consonent:"+count2);
	}

}
