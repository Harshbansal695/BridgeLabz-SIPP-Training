import java.util.Scanner;

public class YoungestAndTallestFriend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ages of Amar, Akbar, Anthony:");
        int ageAmar = sc.nextInt();
        int ageAkbar = sc.nextInt();
        int ageAnthony = sc.nextInt();
        
        System.out.println("Enter heights of Amar, Akbar, Anthony:");
        double heightAmar = sc.nextDouble();
        double heightAkbar = sc.nextDouble();
        double heightAnthony = sc.nextDouble();
        
        String youngest = "Amar";
        if (ageAkbar <= ageAmar && ageAkbar <= ageAnthony) youngest = "Akbar";
        if (ageAnthony <= ageAmar && ageAnthony <= ageAkbar) youngest = "Anthony";
        
        String tallest = "Amar";
        if (heightAkbar >= heightAmar && heightAkbar >= heightAnthony) tallest = "Akbar";
        if (heightAnthony >= heightAmar && heightAnthony >= heightAkbar) tallest = "Anthony";
        
        System.out.println("Youngest friend: " + youngest);
        System.out.println("Tallest friend: " + tallest);
    }
}
