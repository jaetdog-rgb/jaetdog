import java.util.Scanner;
 
public class Matrix {
    public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);
        char again;
        do {
 
            int[][][] grades = new int[2][3][3];
            String[] subjects = {"Java", "Database", "Networking"};
            System.out.println("STUDENT GRADE MANAGEMENT SYSTEM");
            System.out.println("Enter grades for 2 Sections, 3 Students, and 3 Subjects.");
 
            for (int s = 0; s < grades.length; s++) {
                System.out.println("\nSection " + (s + 1));
                for (int st = 0; st < grades[s].length; st++) {
                    System.out.println("Student " + (st + 1));
                    for (int sub = 0; sub < grades[s][st].length; sub++) {
                        System.out.print(subjects[sub] + ": ");
                        grades[s][st][sub] = scanner.nextInt();
                    }
                }
            }
 
            System.out.println("\nDISPLAY ALL GRADES");
            for (int s = 0; s < grades.length; s++) {
                System.out.println("\nSECTION " + (s + 1));
                System.out.printf("%-12s", "Student");
                for (int sub = 0; sub < subjects.length; sub++) {
                    System.out.printf("%12s", subjects[sub]);
                }
                System.out.printf("%15s%n", "Average");
                int sectionTotal = 0;
                for (int st = 0; st < grades[s].length; st++) {
                    int studentTotal = 0;
                    System.out.printf("%-12s", "Student " + (st + 1));
                    for (int sub = 0; sub < grades[s][st].length; sub++) {
                      System.out.printf("%12d", grades[s][st][sub]);
                        studentTotal += grades[s][st][sub];
                        sectionTotal += grades[s][st][sub];
                    }
                    double studentAverage = studentTotal / 3.0;
                    System.out.printf("%15.2f%n", studentAverage);
                }
                
                double sectionAverage = sectionTotal / 9.0;
                System.out.printf("%nSection %d Average: %.2f%n",
                        (s + 1), sectionAverage);
            }
            
            System.out.print("\nTry Again [y|n]: ");
            again = scanner.next().charAt(0);
            System.out.println();
        } while (again == 'y' || again == 'Y');
        scanner.close();
 
    }
 
}