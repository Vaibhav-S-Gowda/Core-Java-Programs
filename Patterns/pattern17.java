class pattern17
{
    public static void main(String[] args)
    {
        int n = 5, count = 1;
        for (int i = 1; i <= n; i++) // Rows
        {
            for (int j = 1; j <= n; j++) //Columns
            {
                if (i+j == n+1 || i+j == n+i || i == n ) {
                    System.out.print(count++ + " ");
                }
                else if (i+j > n+1 && i+j < n+i){
                    System.out.print("  ");
                    count++;
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            count = 1;
        }
    }
}

//Output:
//            1
//           1 2
//          1   3
//         1     4
//        1 2 3 4 5