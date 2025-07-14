import java.util.*;
public class TravelDetails{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
System.out.print("Enter name: ");
String name=input.nextLine();
System.out.print("Enter fromCity: ");
String fromCity=input.nextLine();
System.out.print("Enter viaCity: ");
String viaCity=input.nextLine();
System.out.print("Enter toCity: ");
String toCity=input.nextLine();
System.out.print("Enter distance from to via in miles: ");
double fromToVia=input.nextDouble();
System.out.print("Enter distance via to final in miles: ");
double viaToFinalCity=input.nextDouble();
System.out.print("Enter time from to via in minutes: ");
double timeFromToVia=input.nextDouble();
System.out.print("Enter time via to final in minutes: ");
double timeViaToFinalCity=input.nextDouble();
double totalDistance=(fromToVia+viaToFinalCity)*1.6;
double totalTime=timeFromToVia+timeViaToFinalCity;
System.out.println("The Total Distance travelled by "+name+" from "+fromCity+" to "+toCity+" via "+viaCity+" is "+totalDistance+" km and the Total Time taken is "+totalTime+" minutes");
}
}
