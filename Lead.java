import java.util.Scanner;

public class Lead
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);

		int t = in.nextInt();

		int[] array = new int[t*2];
		int[] array1 = new int[t*2];
		int[] array2 = new int[t*2];

		for(int i = 0 ; i < t*2 ; i++)
		{
			array[i] = in.nextInt();
		}
		for(int i = 0 ; i < t*2 ; i += 2)
		{
			int j = 0;

			if(array[i] > array[i+1])
				array1[j] = array[i] - array[i+1];
			else
				array2[j] = array[i+1] - array[i];

			j++;
		}

	}
}