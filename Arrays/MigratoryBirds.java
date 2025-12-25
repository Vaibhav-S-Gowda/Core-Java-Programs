import java.util.Scanner;

public class MigratoryBirds
{
    public static int sightingBirds(int[] arr) {
        // We can use a frequency array because bird types are typically 1–5
        // If you have a bigger range, use a HashMap instead.
        int[] freq = new int[6]; // index 0 unused for 1-5 bird IDs
        // Count occurrences of each bird ID
        for (int id : arr) {
            freq[id]++;
        }
        // Find the bird ID with the highest frequency
        int maxCount = 0;
        int birdId = 0;

        for (int i = 1; i < freq.length; i++) {
            if (freq[i] > maxCount) {
                maxCount = freq[i];
                birdId = i;
            } else if (freq[i] == maxCount && i < birdId) {
                // if tied, pick the smaller ID
                birdId = i;
            }
        }

        return birdId;
    }
    public static void main(String...args)
    {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[scan.nextInt()];
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print("Enter Array!");
            arr[i] = scan.nextInt();
        }
        System.out.println(sightingBirds(arr));
    }
}