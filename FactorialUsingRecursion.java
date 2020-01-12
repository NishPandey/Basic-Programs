import java.util.*;
class FactorialUsingRecursion
{
public static void main(String args[])
{
Scanner sc = new Scanner (System.in);
System.out.println("Enter a number");
int a=sc.nextInt();
int factorial = fact(a);
System.out.println("Factorial of "+a+" is: "+factorial);
}
public static int fact( int a)
{
	if(a==1)
	{
		return a;
		}
	return(a*fact(a-1));
}

}
