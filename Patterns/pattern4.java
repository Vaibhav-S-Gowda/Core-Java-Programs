class pattern4
{
    static public void main(String[] args)
    {
        int n = 5;
        for (int i = 0; i < n; i++) // Rows
        {
            for (int j = 0; j < n; j++) // Columns
            {
                if (i == 0 || i == n-1 || j == 0 || j == n-1) // If the indexes hold either 0 or 4
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}

//Output:
//        * * * * *
//        *       *
//        *       *
//        *       *
//        * * * * *




