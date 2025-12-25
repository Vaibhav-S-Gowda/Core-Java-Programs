class pattern29
{
    public static void main(String[] args)
    {
        int n = 5, temp, count = 1;
        for (int i = 1; i <= n; i++) // Outer loop -> runs for 'n' rows
        {
            temp = count; // Save the current count before printing the row
            for (int j = 1; j <= i; j++) // Inner loop -> runs 'i' times for row 'i'
            {
                if (i == j) // If it's the last element of the row (i == j) → print number only
                {
                    System.out.print(count--);
                }
                else // Otherwise → print number followed by '*'
                {
                    System.out.print(count-- + " * ");
                }
            }
            System.out.println();
            count = temp + i + 1; // Reset count for the next row, Formula ensures next row starts with correct sequence
        }
    }
}

//Output:
//        1
//        3 * 2
//        6 * 5 * 4
//        10 * 9 * 8 * 7
//        15 * 14 * 13 * 12 * 11