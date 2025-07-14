import java.util.Scanner;

public class OddEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();
        if (number <= 0) {
            System.out.println("Not a natural number");
            return;
        }
        for (int i = 1; i <= number; i++) {
            System.out.println(i + " is " + (i % 2 == 0 ? "even" : "odd"));
        }
    }
}