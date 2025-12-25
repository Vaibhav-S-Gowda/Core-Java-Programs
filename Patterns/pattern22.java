class pattern22
{
    public static void main(String...args)
    {
        int n = 5;
        for (int i = 1; i <= n; i++) // Rows
        {
            for (int k = 1; k <= n-i; k++) // For initial spaces for columns
            {
                System.out.print("  ");
            }
                for (int j = 1; j <= (2 * i) - 1; j++) // Columns
                {
                    System.out.print("* ");
                }
            System.out.println();
        }
    }
}

//Output:
//                *
//              * * *
//            * * * * *
//          * * * * * * *
//        * * * * * * * * *