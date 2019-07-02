package assingment;

import java.util.Scanner;
public class Palindrome
{
    public static void main(String args[])
    {
        int n, m, a = 0,x;
        Scanner s = new Scanner(System.in);
        System.out.print("  Enter any number:");
        n = s.nextInt();
        m = n;
        while(n > 0)
        {
            x = n % 10;
            a = a * 10 + x;
            n = n / 10;
        }
        if(a == m)
        {
            System.out.println("  "+m+" is Palindrome number");
        }
        else
        {
            System.out.println("  "+m+" is Not Palindrome number");
        } s.close();
    }
}