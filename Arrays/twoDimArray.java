import java.util.Scanner;
import java.util.Arrays;

class twoDimArray{
    public static void main(String...args){
        Scanner scan = new Scanner(System.in);
        System.out.println("How many classrooms do you want to store?");
        int num1 = scan.nextInt();
        System.out.println("How many students age do you want to store?");
        int num2 = scan.nextInt();

        int[][] arr = new int[num1][num2];
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                System.out.println("Store students age in classroom " + (i+1));
                arr[i][j] = scan.nextInt();
            }
        }
        System.out.println("The 2-D array looks like this : " + Arrays.deepToString(arr));

        System.out.println("\nMatrix view (using for-each):");

        // Outer loop -> each row (which is itself an array)
        for (int[] row : arr) {
            for (int age : row) // Inner loop -> each element in the row
            {
                System.out.print(age + " ");
            }
            System.out.println();
        }

    }
}