//Another method to solve pattern25
class pattern26
{
    public static void main(String...args)
    {
        int n = 5; // Number of rows to print
        for (int i = 1; i <= n; i++) // Outer loop -> runs from 1 to n (controls rows)
        {
            if (i%2 == 0) // If the row number (i) is even -> print (i+1) before the row starts
            {
                System.out.print(i+1);
            }
            for (int j = 1; j <= n; j++) // Inner loop -> prints 'i' exactly 'n' times in each row (controls columns)
            {
                System.out.print(i);
            }
            if (i%2 == 1) // If the row number (i) is odd -> print (i+1) after the row ends
            {
                System.out.print(i+1);
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