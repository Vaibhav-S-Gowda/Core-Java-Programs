class pattern32
{
    public static void main(String[] args)
    {
        int n = 5;
        for (int i = 1; i <= n; i++) // Outer loop -> controls the rows (1 to n)
        {
            char a = 'A'; // Starting character (capital A)
            for (int j = 1; j <= i; j++) // Inner loop -> prints characters in each row
            {
                System.out.print(a++ + " "); // Increment the character to the next letter (A → B → C → ...)
            }
            System.out.println();
        }
    }
}

//Output:
//A
//A B
//A B C
//A B C D
//A B C D E 