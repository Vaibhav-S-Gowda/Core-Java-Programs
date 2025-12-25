//Another way to solve pattern29
class pattern30
{
    public static void main(String[] args)
    {
        int n = 5;
        for (int i = 1; i <= n ; i++) // Outer loop -> controls the rows (1 to n)
        {
            int count = i*(i+1)/2; // Formula: i*(i+1)/2 gives the last number of the i-th row -> Example: for row 3 → 3*(3+1)/2 = 6
            for (int j = 1; j <= i; j++) // Inner loop -> prints i numbers in the i-th row
            {
                System.out.print(count-j+1); // Print numbers in reverse order starting from 'count'
                if (j < i) // If not the last number of the row, print a "*"
                {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}

//Output:
//        1
//        3*2
//        6*5*4
//        10*9*8*7
//        15*14*13*12*11