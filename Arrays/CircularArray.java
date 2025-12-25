import java.util.Arrays;

public class CircularArray
{
    static int[] circularArrayRotation(int[] arr,int k,int[] q )
    {
        int[] res = new int[q.length]; // Result array to store answers for queries
        int[] b = new int[arr.length]; // Array to hold rotated version of arr

        // Step 1: Rotate the array
        // Place each element of arr into its new position
        // (i + k) % arr.length gives the rotated index
        for (int i = 0; i < arr.length; i++)
        {
            b[(i+k)%arr.length] = arr[i];
        }

        // Step 2: Answer the queries
        // For each index in q, pick the element from rotated array b
        for (int i = 0; i < q.length; i++)
        {
            res[i] = b[q[i]];
        }

        // Step 3: Return the result array
        return res;
    }

    public static void main(String...args)
    {
        int[] arr = {4,2,3,5};
        int k = 3; // Number of right rotations
        int[] query = {1,3}; // Queries: which indices to retrieve from rotated array
        System.out.println(Arrays.toString(circularArrayRotation(arr, k, query))); // Perform rotation and print results of queries
    }
}