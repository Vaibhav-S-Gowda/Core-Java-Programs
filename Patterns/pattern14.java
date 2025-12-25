class pattern14
{
    public static void main(String...args)
    {
        int n = 5;
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= n; j++)
            {
                if(j+i >= 6)
                {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

//Time Complexity = O(n²)
//Space Complexity = O(1)

//Output:
//                      *
//                    * *
//                  * * *
//                * * * *
//              * * * * *