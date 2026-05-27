/*
    "Odd or Even Number"

    Output:
    Enter the number:
    20
    Even number
 */
import java.util.*;
class OddEven
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        OddEven oe = new OddEven();
        int n;
        System.out.println("Enter the number: ");
        n=in.nextInt();
        oe.check(n);
        in.close();
    }
    void check(int n)
    {
        if(n%2==0)
            System.out.println("Even number");
        else
            System.out.println("Odd Number");
    }
}