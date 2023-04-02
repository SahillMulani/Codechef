import java.util.Scanner;

public class TurboSort
{

	public static void turboSort(int t ,int[] array)
	{
		for(int i = 0;i <t -1; i++)
		{
			for(int j = 0; j < t-1-i ; j++)
			{
				if(array[j] > array[j+1])
				{
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}

	}
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);

		int t = in.nextInt();
		int[] array = new int[t];
		for(int i = 0;i<t;i++)
		{
			array[i] = in.nextInt();
		}
		turboSort(t,array);
		for(int i = 0;i<t;i++)
		{
			System.out.print(array[i]+" ");
		}
	}
}