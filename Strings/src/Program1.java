class Program1
{
    int fib(int n)
    {
        if (n <= 2)
        {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }
    public static void main(String[] args)
    {
        Program1 obj = new Program1();
        int n = 7;
        System.out.println(obj.fib(n));
    }
}