import java.util.Scanner;
import java.util.Arrays; // Importing the Arrays utility class to use the toString() method for printing arrays

public class oneDimArray
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in); // Creating a Scanner object to take input from the keyboard
        System.out.println("How many ages do you want to store?");
        int num = scan.nextInt(); // Reading the number entered by the user
        int[] a = new int[num]; // Declaring and creating an integer array with 'num' size
        for (int i = 0; i < a.length; i++)
        {
            System.out.println("Enter any age");
            a[i] = scan.nextInt();
        }
        System.out.println("The ages are: " + Arrays.toString(a)); // Printing the entire array using Arrays.toString() (for proper array output)
    }
}