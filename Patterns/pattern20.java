class pattern20
{
    public static void main(String...args)
    {
        int n = 5;
        for (int i = 1; i <= n ; i++) // Rows
        {
            for (int j = 1; j <= i; j++) // Columns
            {
                System.out.print("* ");
            }
            System.out.println();
            if ( i < n ) // Condition for not printing the last row
            {
                for (int j = 1; j <= i; j++) // printing extra stars
                {
                    System.out.print("* ");
                }
            }
        }
    }
}

//Output:
//        *
//        * * *
//        * * * * *
//        * * * * * * *
//        * * * * * * * * * 