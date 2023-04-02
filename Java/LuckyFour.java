
import java.util.Scanner ;

public class LuckyFour
{
	public static int Fours(int i , int[] array)
	{
		int count = 0;
	while(array[i] != 0)
		{
			int a = array[i]%10;
			if(a == 4)
			{
				count++;
			}
			array[i] = array[i] / 10; 
		}
		return count;
	}
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);

		int t = in.nextInt();
		int[] array = new int[t];
		for(int i = 0;i<t;i++)
		{
			array[i] = in.nextInt();
			System.out.println(Fours(i,array));

		}
		
	}
}