package array;

public class MinimumValue
{
	public static void main(String[] args) 
	{
		int[] ia = {5,65,6,5,3,5,56,31,2,4};
		
		int min=ia[0];
		for(int i=1;i<ia.length;i++)
		{
			if(min>ia[i])
			{
				int temp = min;
				min = ia[i];
				ia[i] =temp;		
			}
		}
        System.out.println("Minimum Value:"+min);
	}

}
