package string;

public class RemoveCharacterFromString 
{
	public static String removeChar(String s,int i)
	{
		return s.substring(0,i)+s.substring(i+1);
	}
	public static void main(String[] args) 
	{
		String str ="My Name Is Kush";
		String s = removeChar(str,3);
		System.out.println(s);
	}

}
