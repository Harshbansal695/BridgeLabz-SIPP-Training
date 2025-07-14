import java.util.Scanner;

public class toLowerCaseComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String text = sc.nextLine();
        
        String customLowerCase = convertToLowerCase(text);
        String builtInLowerCase = text.toLowerCase();
        
        boolean areEqual = compareStrings(customLowerCase, builtInLowerCase);
        
        System.out.println("Original text: " + text);
        System.out.println("Custom lowercase: " + customLowerCase);
        System.out.println("Built-in lowercase: " + builtInLowerCase);
        System.out.println("Strings are equal: " + areEqual);
    }
    
    public static String convertToLowerCase(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                result.append((char)(c + 32));
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