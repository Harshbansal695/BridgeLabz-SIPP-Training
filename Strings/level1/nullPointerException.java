public class nullPointerException {
    public static void main(String[] args) {
        System.out.println("Calling method to generate exception:");
        generateException();
        
        System.out.println("\nCalling method to handle exception:");
        handleException();
    }
    
    public static void generateException() {
        String text = null;
        int length = text.length();
        System.out.println("Length: " + length);
    }
    
    public static void handleException() {
        String text = null;
        try {
            int length = text.length();
            System.out.println("Length: " + length);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught: " + e.getMessage());
        }
    }
} 