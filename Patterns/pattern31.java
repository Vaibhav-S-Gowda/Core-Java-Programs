class pattern31
{
    public static void main(String[] args)
    {
        int n = 5;
        char a = 'A'; // Starting character (capital A)
        for (int i = 1; i <= n; i++) // Outer loop -> controls the rows (1 to n)
        {
            for (int j = 1; j <= i; j++) // Inner loop -> prints characters in each row
            {
                System.out.print(a + " "); // Print the current character followed by a space
            }
            System.out.println();
            a++; // Increment the character to the next letter (A → B → C → ...)
        }
    }
}

//Output:
//          A
//          B B
//          C C C
//          D D D D
//          E E E E E