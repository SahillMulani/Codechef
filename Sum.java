import java.util.Scanner;

public class Sum
{
	public static int Sum(int i,int array[])
	{
		int sum = 0;
		while(array[i] != 0)
		{
			int a = array[i]%10;
			sum = sum + a;
			array[i] = array[i] / 10; 
		}
		return sum;
	}
	public static void main(String[] args)
	{

		Scanner in = new Scanner(System.in);

		int T = in.nextInt();

		int[] array = new int[T];
		for(int i =0; i < T;i++)
		{
			array[i] = in.nextInt();
		}
		for(int i =0; i < T;i++)
		{
			System.out.println(Sum(i , array));
		}
		
		
	}
} 