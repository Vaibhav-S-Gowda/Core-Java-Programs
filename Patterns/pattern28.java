class pattern28
{
    public static void main(String[] args)
    {
        int n = 5, count = 1;
        for (int i = 1; i <= n; i++) // Outer loop -> controls the number of rows
        {
            for (int j = 1; j <= i; j++) // Inner loop -> controls the number of columns and prints numbers in each row
            {
                if (count < 10) // Formatting: if number is single digit (< 10), add extra space for alignment
                {
                    System.out.print(count++ + "  ");
                }
                else
                {
                    System.out.print(count++ + " ");
                }
            }
            System.out.println();
        }
    }
}

//Output:
//        1
//        2  3
//        4  5  6
//        7  8  9  10
//        11 12 13 14 15