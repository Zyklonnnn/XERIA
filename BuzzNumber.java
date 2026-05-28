/*
    "Buzz Number: A number which ends with 7 or is divisible by 7."

    Output:
    Enter the number: 
    67
    Buzz Number
 */
import java.util.*;
class BuzzNumber
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        BuzzNumber bn = new BuzzNumber();
        int n;
        System.out.println("Enter the number: ");
        n=in.nextInt();
        bn.buzzCheck(n);
        in.close();
    }
    void buzzCheck(int n)
    {
        if(n%10==7||n%7==0)
            System.out.println("Buzz Number");
        else
            System.out.println("Not a Buzz Number");
    }
}