package basics;

import java.util.Scanner;

public class PrimeNumber
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter An Number");
		int num = sc.nextInt();
	    sc.close();

		int i = 2;
		while (i < num)
		{
			if (num % i == 0) 
			{
				break;
			}
			i++;
		}
		if (i == num) 
		{
			System.out.println("Prime Number");
		} 
		else 
		{
			System.out.println("Not A Prime Number");
		}

	}

}
