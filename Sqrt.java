import java.lang.Math;
import java.util.Scanner;

public class Sqrt
{
	public static void Sqrt(int t,int[] array)
	{

		for(int i =0; i < t;i++)
		{
			System.out.println((int)Math.sqrt(array[i]));
		}
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
		Sqrt(T,array);

	}
}