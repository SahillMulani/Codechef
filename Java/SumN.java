import java.util.Scanner;

public class SumN
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int T = in.nextInt();
       int result ;
        while(T-->0)
        {
            int a = in.nextInt();
            result = 0;
            while(a > 0)
            {
                int temp = a%10;
                //System.out.println(temp);
                result = result + temp;
                a = a/10;
            }
            System.out.println(result);
        }
    }
}