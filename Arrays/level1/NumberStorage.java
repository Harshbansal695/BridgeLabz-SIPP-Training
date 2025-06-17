import java.util.Scanner;

public class NumberStorage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;
        
        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double input = scanner.nextDouble();
            
            if (input <= 0 || index >= 10) {
                break;
            }
            
            numbers[index] = input;
            index++;
        }
        
        System.out.println("\nNumbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
            total += numbers[i];
        }
        
        System.out.println("Sum of all numbers: " + total);
        scanner.close();
    }
} 