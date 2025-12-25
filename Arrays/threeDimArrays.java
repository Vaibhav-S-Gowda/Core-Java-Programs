import java.util.Scanner;

class threeDimArrays
{
    public static void main(String...args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of schools!");
        int num1 = scan.nextInt();
        System.out.println("Enter the number of classrooms!");
        int num2 = scan.nextInt();
        System.out.println("Enter the number of students!");
        int num3 = scan.nextInt();
        int[][][] arr = new int[num1][num2][num3];

        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                for (int k = 0; k < arr[i][j].length; k++)
                {
                    System.out.println("Store the age of school "+ (i+1) +", classroom "+ (j+1) +" and student "+(k+1));
                    arr[i][j][k] = scan.nextInt();
                }
            }
        }
        System.out.println("\nPrinting values using for-each loop:");
        int school = 1;
        for (int[][] schoolArr : arr) {
            int classroom = 1;
            for (int[] classArr : schoolArr) {
                int student = 1;
                for (int age : classArr) {
                    System.out.println("School " + school +
                            ", Classroom " + classroom +
                            ", Student " + student +
                            " = " + age);
                    student++;
                }
                classroom++;
            }
            school++;
        }
    }
}