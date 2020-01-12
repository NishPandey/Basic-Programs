import java.util.*;
class FactorialOfANumber
{
public static void main (String args[])
{
	long fact=1;
	Scanner sc = new Scanner (System.in);
System.out.println("Enter a Number ");
int a = sc.nextInt();
for( int i =1; i<=a; i++)
{
 fact = fact * i;
}
System.out.println("Factorial of a "+a+" is: "+fact);
}
}