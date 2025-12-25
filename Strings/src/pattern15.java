import java.io.*;

class pattern15
{
    public static void printRow(int n, int totalRows)
    {
        if (totalRows == 0)
        {
            return;
        }
        if (totalRows <= n) // Condition to print star
        {
            System.out.print(" *");
        }
        else //Condition to print space
        {
            System.out.print("  ");
        }
        printRow(n,totalRows - 1); //Moving to next column recursively
    }
    //Similar to outer for loop
    public static void newRow(int n, int totalRows)
    {
        if (n==0)
        {
            return;
        }
        newRow(n - 1, totalRows);
        printRow(n, totalRows); //Prints stars and spaces in a single row
        System.out.println(); //New row... new line
    }
    public static void main(String[] args)
    {
        pattern15.newRow(5,5); //newRow is static method so no need to create an object of class.
    }
}

//Time Complexity: O(n)
//Auxiliary Space: O(n), Due to recursion stack in memory.

//Output:
//                *
//              * *
//            * * *
//          * * * *
//        * * * * *
