import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int n = scanner.nextInt();
        
        double[] weights = new double[n];
        double[] heights = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");
            System.out.print("Enter weight (kg): ");
            weights[i] = scanner.nextDouble();
            System.out.print("Enter height (m): ");
            heights[i] = scanner.nextDouble();
            
            if (weights[i] <= 0 || heights[i] <= 0) {
                System.out.println("Invalid input! Please enter positive values.");
                i--;
                continue;
            }
            
            bmi[i] = weights[i] / (heights[i] * heights[i]);
            
            if (bmi[i] < 18.5) {
                status[i] = "Underweight";
            } else if (bmi[i] < 25) {
                status[i] = "Normal weight";
            } else if (bmi[i] < 30) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        
        System.out.println("\nResults:");
        for (int i = 0; i < n; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");
            System.out.println("Height: " + heights[i] + "m");
            System.out.println("Weight: " + weights[i] + "kg");
            System.out.println("BMI: " + String.format("%.2f", bmi[i]));
            System.out.println("Status: " + status[i]);
        }
        scanner.close();
    }
} 