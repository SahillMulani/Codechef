import java.util.Scanner;

public class SecondLargest
{
	public static int SecondLargest(int t ,int i, int[][] array)
	{
		int j = 0;
		for(int k = 0;k<t -1; k++)
		{
			for(; j < t-1-k ; j++)
			{
				if(array[i][j] > array[i][j+1])
				{
					int temp = array[i][j];
					array[i][j] = array[i][j+1];
					array[i][j+1] = temp;
				}
			}
		}
		return array[i][j-1];

	}

	public static void main(String[] args)
	{

		Scanner in = new Scanner(System.in);

		int t = in.nextInt();

		int[][] array = new int[t][3];

		for(int i = 0; i < t; i++)
		{
			 for(int j=0;j<3;j++)
			{
				System.out.println("Enter "+i+" "+j+" : ");
				array[i][j] = in.nextInt();
			}
			System.out.println("Second Largest Element is "+SecondLargest(t,i,array));
		}
		
	}
}