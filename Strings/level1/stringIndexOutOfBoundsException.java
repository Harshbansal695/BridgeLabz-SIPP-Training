import java.util.Scanner;

public class stringIndexOutOfBoundsException {
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
        char character = text.charAt(text.length() + 1);
        System.out.println("Character: " + character);
    }
    
    public static void handleException(String text) {
        try {
            char character = text.charAt(text.length() + 1);
            System.out.println("Character: " + character);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException caught: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught: " + e.getMessage());
        }
    }
} 