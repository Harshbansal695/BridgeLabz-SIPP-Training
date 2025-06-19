import java.util.Scanner;

public class illegalArgumentException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String text = sc.next();
        
        System.out.println("Calling method to generate exception:");
        generateException(text);
        
        System.out.println("\nCalling method to handle exception:");
        handleException(text);
    }
    
    public static void generateException(String text) {
        String substring = text.substring(5, 2);
        System.out.println("Substring: " + substring);
    }
    
    public static void handleException(String text) {
        try {
            String substring = text.substring(5, 2);
            System.out.println("Substring: " + substring);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught: " + e.getMessage());
        }
    }
} 