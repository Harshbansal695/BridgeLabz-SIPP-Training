import java.util.Scanner;

public class StudentGrades2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();
        
        int[][] marks = new int[n][3];
        double[] percentage = new double[n];
        char[] grade = new char[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");
            System.out.print("Physics marks: ");
            marks[i][0] = scanner.nextInt();
            System.out.print("Chemistry marks: ");
            marks[i][1] = scanner.nextInt();
            System.out.print("Maths marks: ");
            marks[i][2] = scanner.nextInt();
            
            if (marks[i][0] < 0 || marks[i][1] < 0 || marks[i][2] < 0) {
                System.out.println("Invalid marks! Please enter positive values.");
                i--;
                continue;
            }
            
            percentage[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;
            
            if (percentage[i] >= 90) {
                grade[i] = 'A';
            } else if (percentage[i] >= 80) {
                grade[i] = 'B';
            } else if (percentage[i] >= 70) {
                grade[i] = 'C';
            } else if (percentage[i] >= 60) {
                grade[i] = 'D';
            } else {
                grade[i] = 'F';
            }
        }
        
        System.out.println("\nResults:");
        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");
            System.out.println("Physics: " + marks[i][0]);
            System.out.println("Chemistry: " + marks[i][1]);
            System.out.println("Maths: " + marks[i][2]);
            System.out.println("Percentage: " + String.format("%.2f", percentage[i]) + "%");
            System.out.println("Grade: " + grade[i]);
        }
        scanner.close();
    }
} 