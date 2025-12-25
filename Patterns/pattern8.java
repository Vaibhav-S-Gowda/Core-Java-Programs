class pattern8
{
    public static void main(String...args)
    {
        int n = 5;
        for (int i = 0; i < n; i++) // Rows
        {
            for (int j = 1; j <= n; j++) // Columns
            {
                if ( i+j < 10)
                {
                    System.out.print("0" + i + j + " ");
                } else {
                    System.out.print(i+j + " ");
                }
            }
            System.out.println();
        }
    }
}

//Output:
//        001 002 003 004 005
//        011 012 013 014 015
//        021 022 023 024 025
//        031 032 033 034 035
//        041 042 043 044 045
    