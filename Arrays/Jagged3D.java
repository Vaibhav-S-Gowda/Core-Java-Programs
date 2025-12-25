import java.util.Scanner;

public class Jagged3D{
    public static void main(String...args){
        Scanner scan = new Scanner(System.in);

        // Step 1: Input number of schools and initialize 3D jagged array
        System.out.println("Enter the number of schools!");
        int[][][] arr = new int[scan.nextInt()][][];

        // Step 2: For each school, input the number of classrooms and allocate memory
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the number of classroom in school " + (i + 1));
            arr[i] = new int[scan.nextInt()][];
        }

        // Step 3: For each classroom, input the number of students and allocate memory
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Enter the number of students in school "+(i+1)+" class " +(j+1));
                arr[i][j] = new int[scan.nextInt()];
            }
        }

        // Step 4: Input the age of each student for every classroom in every school
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                for (int k = 0; k < arr[i][j].length; k++)
                {
                    System.out.println("Store the age of school "+(i+1)+" class "+(j+1)+" student "+(k+1));
                    arr[i][j][k] = scan.nextInt();
                }
            }
        }

        // Step 5: Display all stored student ages in a structured matrix-like format
        System.out.println("Stored data represented in a matrix format!");
        System.out.print("["); // Opening bracket for the entire structure
        for (int i = 0; i < arr.length; i++) { // Loop over schools
            System.out.print(" ");
            for (int j = 0; j < arr[i].length; j++) { // Loop over classrooms
                System.out.print("(");
                for (int k = 0; k < arr[i][j].length; k++) { // Loop over students
                    System.out.print(arr[i][j][k]); // Print student age

                    if (k < arr[i][j].length-1){ // Add a comma between student ages (but not after the last one)
                        System.out.print(", ");
                    }
                }
                System.out.print(")"); // Closing bracket for one classroom

                if (j < arr[i].length-1){ // Add a comma between classrooms (but not after the last one)
                    System.out.print(", ");
                }
            }
            if (i < arr.length - 1){ // Move to new line between schools (but not after the last one)
                System.out.println();
            }
        }
        System.out.print(" ]"); // Closing bracket for the entire structure
    }
}

//Time Complexity :
// O(S)+O(C)+O(N)+O(N)=O(S+C+N)
// O(N)

//Space Complexity :
// O(N)