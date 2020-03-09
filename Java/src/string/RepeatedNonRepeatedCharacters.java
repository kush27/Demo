package string;

import java.util.HashMap;
import java.util.Scanner;

public class RepeatedNonRepeatedCharacters
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A String");
		String str = sc.nextLine();
		sc.close();

		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		char[] ca = str.toCharArray();
		
		for(char c:ca)
		{
			if(hm.containsKey(c))
			{
				hm.put(c,hm.get(c)+1);
			}
			else
			{
				hm.put(c,1);
			}
		}
		System.out.println(hm);
		
        System.out.println("Non Repeated Character:");
        for(char c:ca)
        {
        	if(hm.get(c)==1)
        	{
        		System.out.print(c+" ");
        	}
        }
        System.out.println();
        System.out.println("Repeated Characters:");
        for(char c:hm.keySet())
        {
			if(hm.get(c)>1&& !Character.isWhitespace(c))
			{
				System.out.print(c+" ");
			}

        }

	}

}
