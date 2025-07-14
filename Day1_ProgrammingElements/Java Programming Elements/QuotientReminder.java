import java.util.*;
public class QuotientReminder{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
System.out.print("Enter first number: ");
int a=input.nextInt();
System.out.print("Enter second number: ");
int b=input.nextInt();
System.out.println("The Quotient is "+a/b+" and Reminder is "+a%b+" of two number "+a+" and "+b);
}
}
