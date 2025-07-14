import java.util.*;
class PurchasePrice{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
System.out.print("Enter Unit Price: ");
double unitPrice=input.nextDouble();
System.out.print("Enter Quantity: ");
int quantity=input.nextInt();
double total=unitPrice*quantity;
System.out.println("The total purchase price is INR "+total+" if the quantity "+quantity+" and unit price is INR "+unitPrice);
}
}