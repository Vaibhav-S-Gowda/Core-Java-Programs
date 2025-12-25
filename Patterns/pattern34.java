// Another method to solve pattern34
class pattern34
{
    public static void main(String[] args)
    {
        int n = 5;
        char a = 'A';
        for (int i = 1; i <= n; i++)
        {
            int b = a + i - 1;
            if (i%2 == 0)
            {
                for (int j = 1; j <= i; j++)
                {
                   System.out.print((char)b-- + " ");
                }
            }
            else
            {
                a = (char)b;
                for (int j = 1; j <= i; j++)
                {
                   System.out.print(a++ + " ");
                }
            }
            System.out.println();
        }
    }
}