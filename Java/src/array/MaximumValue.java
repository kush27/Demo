package array;

public class MaximumValue
{
	public static void main(String[] args) 
	{
		int[] ia = {1,5,8,53,86,42,15};
		
		int max=ia[0];
		for(int i=1;i<ia.length;i++)
		{
			if(max<ia[i])
			{
				int temp = max;
				max = ia[i];
				ia[i] =temp;		
			}
		}
        System.out.println("Maximum Value:"+max);  
	}

}
