import java.util.Scanner;

public class BMICalculator2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int n = scanner.nextInt();
        
        double[][] personData = new double[n][3];
        String[] weightStatus = new String[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");
            System.out.print("Enter weight (kg): ");
            personData[i][0] = scanner.nextDouble();
            System.out.print("Enter height (m): ");
            personData[i][1] = scanner.nextDouble();
            
            if (personData[i][0] <= 0 || personData[i][1] <= 0) {
                System.out.println("Invalid input! Please enter positive values.");
                i--;
                continue;
            }
            
            personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);
            
            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] < 25) {
                weightStatus[i] = "Normal weight";
            } else if (personData[i][2] < 30) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }
        
        System.out.println("\nResults:");
        for (int i = 0; i < n; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");
            System.out.println("Height: " + personData[i][1] + "m");
            System.out.println("Weight: " + personData[i][0] + "kg");
            System.out.println("BMI: " + String.format("%.2f", personData[i][2]));
            System.out.println("Status: " + weightStatus[i]);
        }
        scanner.close();
    }
} 