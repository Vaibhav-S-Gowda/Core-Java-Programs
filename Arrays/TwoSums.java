import java.util.Arrays;
import java.util.Scanner;

public class TwoSums
{
    static public int[] twoSumCalculator(int[] nums, int target)
    {
        for(int i = 0; i < nums.length - 1; i++)
        {
            for(int j = i+1; j < nums.length; j++)
            {
                if ((nums[i] + nums[j]) == target) // Check if the sum of the two numbers equals the target
                {
                    return new int[]{i,j}; // If yes, return their indices immediately
                }
            }
        }
        return new int[]{}; // If no pair found, return an empty array
    }

    public static void main(String...args)
    {
        Scanner scan = new Scanner(System.in);
        int target = scan.nextInt();
        int[] arr = new int[scan.nextInt()];
        for (int i = 0; i < arr.length; i++)
        {
            System.out.println("Enter array values");
            arr[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(twoSumCalculator(arr, target))); // Call twoSumCalculator() to find indices of the two numbers
    }
}