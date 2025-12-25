//Create an array to store the ages of students belonging to 2 classrooms where
//first classroom has 3 students and second classroom has 5 students

import java.util.Scanner;

public class Jagged2D{
    public static void main(String...args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of classes!");
        int clrm = scan.nextInt();
        int[][] arr = new int[clrm][]; // Create a jagged 2D array (number of rows = classrooms, columns vary per class)
        for (int i = 0; i < clrm; i++) // Loop to initialize each row with different sizes (number of students per class)
        {
            System.out.println("Enter the number of students age belonging to class "+ (i+1));
            arr[i] = new int[scan.nextInt()];
        }

        for (int i = 0; i < arr.length; i++) // Store ages of students in each classroom
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                System.out.println("Store the ages of student belonging to classroom "+ (i+1));
                arr[i][j] = scan.nextInt();
            }
        }

        for (int i = 0; i < arr.length; i++) // Display all stored ages class by class
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                System.out.println("Classroom "+(i+1)+", student "+(j+1)+" :"+arr[i][j]);
            }
        }
    }
}