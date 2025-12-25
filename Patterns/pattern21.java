// Another method to solve pattern20
class pattern21
{
    public static void main(String...args)
    {
        int n = 5;
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= (2*i)-1; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}