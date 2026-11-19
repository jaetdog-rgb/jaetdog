import java.util.Scanner;
public class main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        char again;
 
        do {
 
            int[][] matrix = new int[3][3];
            System.out.println("Input 9 Elements:");
 
            for (int r = 0; r < matrix.length; r++) {
                for (int c = 0; c < matrix[r].length; c++) {
                    System.out.print("Enter a Number: ");
                    matrix[r][c] = scanner.nextInt();
 
                }
 
            }
           
            int[] colSum = new int[3];
            int diagonal1 = 0;
            int diagonal2 = 0;
            System.out.println("\nNumbers And Row Sum:");
 
            for (int r = 0; r < matrix.length; r++) {
                int rowSum = 0;
              for (int c = 0; c < matrix[r].length; c++) {
                    System.out.printf("%5d", matrix[r][c]);
                    rowSum += matrix[r][c];
                    colSum[c] += matrix[r][c];
 
                }
 
                System.out.printf(" | Row Sum: %d\n", rowSum);
 
            }
 
            System.out.println("\nColumn Sum:");
            for (int c = 0; c < 3; c++) {
                System.out.println("Column " + (c + 1) + ": " + colSum[c]);
 
            }
 
            for (int i = 0; i < 3; i++) {
                diagonal1 += matrix[i][i];
                diagonal2 += matrix[i][2 - i];
 
            }
 
            System.out.println("\nDiagonal Sum 1: " + diagonal1);
            System.out.println("Diagonal Sum 2: " + diagonal2);
            System.out.print("\nTry Again [y/n]: ");
            again = scanner.next().charAt(0);
 
        } while (again == 'y' || again == 'Y');
        System.out.println("Program Ended. Thank You!");
 
        scanner.close();
 
    }
 
}