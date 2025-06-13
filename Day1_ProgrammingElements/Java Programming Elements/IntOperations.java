import java.util.*;
public class IntOperations{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
System.out.print("Enter a: ");
int a=input.nextInt();
System.out.print("Enter b: ");
int b=input.nextInt();
System.out.print("Enter c: ");
int c=input.nextInt();
int res1=a+b*c;
int res2=a*b+c;
int res3=c+a/b;
int res4=a%b+c;
System.out.println("The results of Int Operations are "+res1+", "+res2+", "+res3+", and "+res4);
}
}
