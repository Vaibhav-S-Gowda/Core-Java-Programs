class  pattern6
{
    public static void main(String[] args)
    {
        int n = 5;
        for (int i = 1; i <= n; i++) // Rows
        {
            for (int j = 1; j <= n; j++) // Columns
            {
                if ( i*j < 10) // if the  number is less than 10
                {
                    System.out.print("0" + i*j + " "); // add zero in front of that number
                } else {
                    System.out.print(i*j + " ");
                }
            }
            System.out.println();
        }
    }
}

//Output:
//        01 02 03 04 05
//        02 04 06 08 10
//        03 06 09 12 15
//        04 08 12 16 20
//        05 10 15 20 25