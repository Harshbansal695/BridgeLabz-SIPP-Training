import java.util.Scanner;

public class numberFormatException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string (non-numeric to cause exception):");
        String text = sc.next();
        
        System.out.println("Calling method to generate exception:");
        generateException(text);
        
        System.out.println("\nCalling method to handle exception:");
        handleException(text);
    }
    
    public static void generateException(String text) {
        int number = Integer.parseInt(text);
        System.out.println("Number: " + number);
    }
    
    public static void handleException(String text) {
        try {
            int number = Integer.parseInt(text);
            System.out.println("Number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught: " + e.getMessage());
        }
    }
} 