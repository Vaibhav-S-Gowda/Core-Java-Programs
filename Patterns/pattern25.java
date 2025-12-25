class pattern25
{
    public static void main(String...args)
    {
        int n = 5; // Number of rows
        for (int i = 1; i <= n; i++) // Outer loop -> controls the number of rows
        {
            for (int j = 1; j <= n+1; j++) // Inner loop -> controls the number of columns (n+1 columns in each row)
            {
                if (i%2 == 1 && j > n) // Case 1: If row number (i) is odd and column is the last one -> print i+1
                {
                    System.out.print(i+1);
                }
                else if (i%2 == 1 && j == 1) // Case 2: If row number (i) is odd and column is the first one -> print i
                {
                    System.out.print(i);
                }
                else if (i%2 == 0 && j == 1 ) // Case 3: If row number (i) is even and column is the first one -> print i+1
                {
                    System.out.print(i+1);
                }
                else // Default case: Print i for all other positions
                {
                    System.out.print(i);
                }
            }
            System.out.println();
        }
    }
}

//Output:
//        111112
//        322222
//        333334
//        544444
//        555556