class pattern5
{
    public static void main(String[] args)
    {
        int n = 5, i,j, count = 01;
        for (i = 1; i <= n; i++) // Rows
        {
            for (j = 1; j <= n; j++) // Columns
            {
                if (count < 10) {
                    System.out.print("0" + count++ + " ");
                } else {
                    System.out.print(count++ + " ");
                }
            }
            System.out.println();
        }
    }
}

//Output:
//        01 02 03 04 05
//        06 07 08 09 10
//        11 12 13 14 15
//        16 17 18 19 20
//        21 22 23 24 25