import java.util.Scanner;

public class substringComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String text = sc.next();
        System.out.println("Enter start index:");
        int start = sc.nextInt();
        System.out.println("Enter end index:");
        int end = sc.nextInt();
        
        String customSubstring = createSubstring(text, start, end);
        String builtInSubstring = text.substring(start, end);
        
        boolean areEqual = compareStrings(customSubstring, builtInSubstring);
        
        System.out.println("Custom substring: " + customSubstring);
        System.out.println("Built-in substring: " + builtInSubstring);
        System.out.println("Strings are equal: " + areEqual);
    }
    
    public static String createSubstring(String text, int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i < end; i++) {
            result.append(text.charAt(i));
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