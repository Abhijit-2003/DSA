package Recursion;

import java.util.Scanner;

public class Factorial
{
    public static void factOfNum(int n, int ans)
    {
        if(n == 0)
        {
            System.out.println(ans);
            return;
        }

        ans = ans*n;
        factOfNum(n-1,ans);

    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        factOfNum(n,1);
    }
}
