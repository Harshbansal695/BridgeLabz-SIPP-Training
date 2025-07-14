import java.util.Scanner;

public class MultiplesBelow100WhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer below 100: ");
        int number = sc.nextInt();
        if (number <= 0 || number >= 100) {
            System.out.println("Invalid input");
            return;
        }
        int counter = 99;
        while (counter >= 1) {
            if (counter % number == 0) {
                System.out.println(counter);
            }
            counter--;
        }
    }
}