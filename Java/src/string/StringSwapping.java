package string;

public class StringSwapping 
{
	public static void main(String[] args)
	{
		String a = "Kush";
		String b = "Kumar";
		
		System.out.println("Before Swapping:"+a+" "+b);
		
		String temp = "";
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("After Swapping:"+a+" "+b);
		
	}

}
