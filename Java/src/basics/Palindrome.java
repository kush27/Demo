package basics;

import java.util.Scanner;

public class Palindrome
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A Number");
		int num = sc.nextInt();
		sc.close();

		int num1 = num;
		int rev = 0;
		while (num1 > 0) 
		{
			rev = (rev * 10) + (num1 % 10);
			num1 = num1 / 10;
		}
		if (num == rev) 
		{
			System.out.println("Palindrome");
		}
		else 
		{
			System.out.println("Not A Palindrome");
		}

	}

}
