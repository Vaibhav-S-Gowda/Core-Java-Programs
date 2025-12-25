class pattern18
{
    public static void main(String[] args)
    {
        int n = 5;
        for (int i = 1; i <= n; i++) // Rows
        {
            for (int j = 1; j <= i; j++) // Columns
            {
                if (i==j || j == 1 || i == n) {
                    System.out.print(j + " ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

//Output:
//        1
//        1 2
//        1   3
//        1     4
//        1 2 3 4 5 