class pattern23
{
    public static void main(String...args)
    {
        int n = 5; // Number of rows in the pattern
        for (int i = 1; i <= n; i++) // Outer loop for rows (runs from 1 to n)
        {
            int count = 1;
            // Inner loop for columns (runs up to (2 * i) - 1 to form pyramid shape)
            for (int j = 1; j <= (2 * i) - 1; j++) // Columns
            {
                if (i > j) // If current column is less than the row number
                    {
                        System.out.print(count++);
                    }
                    else  // Once we reach the middle of the row
                    {
                        System.out.print(count--);
                    }
            }
            System.out.println();
        }
    }
}

//Output:
//        1
//        121
//        12321
//        1234321
//        123454321