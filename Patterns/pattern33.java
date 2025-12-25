class pattern33
{
    public static void main(String[] args)
    {
        int n = 10,temp, count = 65;
        for (int i = 1; i <= n; i++) // Outer loop -> controls rows
        {
            temp = count; // Save the starting value for this row
            for (int j = 1; j <= i; j++) // Inner loop -> prints characters in each row
            {
                if (i%2 == 0) // If row is even
                {
                    System.out.print((char)count-- + " "); // Print char and then decrement count (go backwards)
                }
                else // If row is odd
                {
                    System.out.print((char)count++ + " "); // Print char and then increment count (go forwards)
                }
            }
            System.out.println();
            // Reset count for the next row
            if (i%2==0) // After even row → next row starts just after temp
            {
                 count = temp + 1;
            }
            else // After odd row → skip ahead by i+i
            {
                count = temp + i + i;
            }
        }
    }
}

//Output:
//A
//C B
//D E F
//J I H G
//K L M N O