class pattern19
{
    public static void main(String[] args)
    {
        int n = 5;
        for (int i = 0; i< n; i++) // Rows
        {
            for (int j = 1; j <= n-i; j++) // Columns
            {
                if (j == 1) // Vertical line
                {
                    System.out.print(i+1 + " ");
                }
                else if (i == 0) // Horizontal line
                {
                    System.out.print(j + " ");
                }
                else if (i+j == n) // Diagonal line
                {
                    System.out.print(n);
                }
                else // Spaces inside the triangle
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

//Output:
//        1 2 3 4 5
//        2     5
//        3   5
//        4 5
//        5