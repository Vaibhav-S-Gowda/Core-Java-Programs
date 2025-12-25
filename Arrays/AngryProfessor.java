import java.util.Scanner;

public class AngryProfessor{
    public static String arrivalTime(int k,int[] a) //This method checks how many students arrived on time
    {
        int count = 0;
        // Step 1: Loop through each student’s arrival time
        for (int i = 0; i < a.length; i++)
        {
            // Step 1.1: If arrival time <= 0, student is on time; increment counter
            if (a[i] <= 0) {
                count++;
            }
        }
        // Step 2: Check if enough students are on time
        if (count >= k)
        {
            return "NO"; //If yes, return "NO" (class not cancelled)
        }
        else
        {
            return "YES"; //Otherwise, return "YES" (class cancelled)
        }
    }
    public static void main(String...args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of students!");
        int n = scan.nextInt();
        System.out.println("Minimum students who must attend");
        int k = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = scan.nextInt();
        }
        System.out.println(arrivalTime(k,arr)); // Call arrivalTime() to determine if class is cancelled
    }
}