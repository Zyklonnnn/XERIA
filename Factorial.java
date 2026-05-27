/*
    "Factorial of a Number"

    Output:
    Enter the number:
    5
    Factorial: 120
 */
import java.util.*;
class factorial
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        factorial f = new factorial();
        int n;
        System.out.println("Enter the number: ");
        n=in.nextInt();
        f.facto(n);
        in.close();
    }
    void facto(int n)
    {
        int f=1;
        for(int i=1;i<=n;i++)
            f=f*i;
        System.out.println("Factorial: "+f);
    }
}