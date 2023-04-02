import java.util.Scanner;

public class ATM 
{
    public static double atm(int amount,double balance)
    {
        if((amount<balance)&&(amount%5 == 0))
        {
            balance = balance - (amount + 0.5);
        }
        return balance;
    }
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int amount = in.nextInt();
        double balance = in.nextDouble();

        System.out.println(atm(amount, balance));      
                
    }
        
}
    

