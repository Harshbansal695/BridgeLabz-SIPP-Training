import java.util.Scanner;

public class toUpperCaseComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String text = sc.nextLine();
        
        String customUpperCase = convertToUpperCase(text);
        String builtInUpperCase = text.toUpperCase();
        
        boolean areEqual = compareStrings(customUpperCase, builtInUpperCase);
        
        System.out.println("Original text: " + text);
        System.out.println("Custom uppercase: " + customUpperCase);
        System.out.println("Built-in uppercase: " + builtInUpperCase);
        System.out.println("Strings are equal: " + areEqual);
    }
    
    public static String convertToUpperCase(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'a' && c <= 'z') {
                result.append((char)(c - 32));
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }
    
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
} 