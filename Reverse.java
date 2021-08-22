import java.util.Scanner;

public class Reverse
{
	public static String reverse(int i,int array[])
	{
		
		String reverse = "";
		
		while(array[i] != 0)
		{
			 int a = array[i]%10;
			reverse = reverse + a;
			array[i] = array[i] / 10; 
		}
		return reverse;
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
			System.out.print(reverse(i , array) + " ");
		}
		
	}
}