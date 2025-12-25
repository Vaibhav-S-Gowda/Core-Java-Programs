class pattern16
{
    public static void main(String[] args)
    {
        int n = 5;
        for (int i = 1; i <= n; i++) // Rows
        {
            for (int j = 1; j <= n ; j++) // Columns
            {
                if (i+j == n+1 || i+j == n+i || i == n) {
                    System.out.print("* ");
                } else if (i+j > n+1 && i+j < n+i) {
                    System.out.print("  ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

//Output:
//            *
//           * *
//          *   *
//         *     *
//        * * * * *