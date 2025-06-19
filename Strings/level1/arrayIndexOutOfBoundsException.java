import java.util.Scanner;

public class arrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of names:");
        int n = sc.nextInt();
        sc.nextLine();
        
        String[] names = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter name " + (i + 1) + ":");
            names[i] = sc.nextLine();
        }
        
        System.out.println("Calling method to generate exception:");
        generateException(names);
        
        System.out.println("\nCalling method to handle exception:");
        handleException(names);
    }
    
    public static void generateException(String[] names) {
        String name = names[names.length + 1];
        System.out.println("Name: " + name);
    }
    
    public static void handleException(String[] names) {
        try {
            String name = names[names.length + 1];
            System.out.println("Name: " + name);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught: " + e.getMessage());
        }
    }
} 