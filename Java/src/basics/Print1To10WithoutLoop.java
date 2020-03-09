package basics;

public class Print1To10WithoutLoop 
{
	public static void print(int i)
	{
		if(i<=10)
		{
			System.out.println(i);
			print(i+1);
		}
	}
	public static void main(String[] args)
	{
		print(1);
	}

}
