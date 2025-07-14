import java.util.Scanner;

public class charArrayComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String text = sc.next();
        
        char[] customArray = getCharArray(text);
        char[] builtInArray = text.toCharArray();
        
        boolean areEqual = compareArrays(customArray, builtInArray);
        
        System.out.println("Custom array length: " + customArray.length);
        System.out.println("Built-in array length: " + builtInArray.length);
        System.out.println("Arrays are equal: " + areEqual);
    }
    
    public static char[] getCharArray(String text) {
        char[] result = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            result[i] = text.charAt(i);
        }
        return result;
    }
    
    public static boolean compareArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
} 