package Recursion;

public class FibonacciNum
{
    public static int fibNum(int n)
    {
        if(n==0 || n==1)
        {
            return n;
        }

        return fibNum(n-1) + fibNum(n-2);
    }
    public static void main(String[] args) {
        int n = 4;

        System.out.println(fibNum(n));
    }
}
