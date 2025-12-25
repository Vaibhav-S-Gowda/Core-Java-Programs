class pattern27
{
    public static void main(String[] args)
    {
        int n = 5; // Number of rows for the upper half of the pattern

        // First half of the pattern (increasing triangle)
        for (int i = 1; i <= n; i++) // Outer loop for rows (1 to n)
        {
            for (int j = 1; j <= i; j++) // Inner loop prints 'i' times
            {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        // Second half of the pattern (decreasing part)
        for (int k = n-1; k > 0; k--) // Outer loop from n-1 down to 1
        {
            for (int l = 1; l < n; l++) // Inner loop prints (n-1), (n-2)... numbers
            {
                System.out.print(k + " ");
            }
            n--;
            System.out.println();
        }
    }
}

//Output:
//        1
//        2 2
//        3 3 3
//        4 4 4 4
//        5 5 5 5 5
//        4 4 4 4
//        3 3 3
//        2 2
//        1

//Time Complexity:
//First half (increasing triangle) - O(n²)
//Second half (decreasing triangle) - O(n²)
//Overall Time Complexity = O(n²)
